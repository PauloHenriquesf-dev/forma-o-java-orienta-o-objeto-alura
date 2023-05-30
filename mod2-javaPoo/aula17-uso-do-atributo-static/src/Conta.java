
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	/* totalDeConta sera um atributo p/ fazer o controle de quantas contas foram criadas
	 * porem se declararmos assim:
	 * 
	 * private int totalDeConta;
	 * 
	 * esse atributo sera um atributo do objeto, ou seja ao dar o new Conta() na MAIN é criado um obj
	 * e todo o objeto criado tera o seu PROPRIO atributo totalDeConta, logo n vai ter um somatorio,
	 * Ao ser criado um Objeto com referencia chamada conta1 vai ser incrementado ++1 em totalDeConta.
	 * Ao ser criado outro objeto de referecia chamada conta2 sera incrementado ++1 em totalDeConta da
	 * conta2.
	 * Percebe que cada conta tem seu proprio totalDeConta?
	 * Devemos declarar totalDeConta como um atributo da CLASSE usando o STATIC dessa forma totalDeConta
	 * sera 'unico'. Todos os objetos criados compartilharam desse mesmo atributo.
	 * Logo ao criar um obj sera incrementado ++1 em totalDeConta, ficando totalDeConta = 1,
	 * se criar outro obj sera incrementado ++1 NO MESMO totalDeConta, ficando totalDeConta = 2...  
	 */
	private static int totalDeConta; // static, atributo da CLASSE
	
	public Conta(int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia e Numero da Conta devem ter valores MAIOR que ZERO");
		} else {
			//se uma conta for aceita vai somar 1 em totalDeConta
			totalDeConta++;
			//ja totalDeConta é um atributo da classe devido o uso de STATIC, pode incrementa-lo assim:
			//Conta.totalDeConta++;
			System.out.println("Total de Contas Criadas: " + Conta.totalDeConta);
			this.agencia = agencia;
			this.numero = numero;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia deve ter valor MAIOR que ZERO");
		} else {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero deve ter valor MAIOR que ZERO");
		} else {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public boolean saca(double valorASacar) {
		if (this.saldo >= valorASacar) {
			this.saldo -= valorASacar;
			return true;
		}
		return false;
	}
	
	public void deposita(double valorADepositar) {
		this.saldo += valorADepositar;
	}
	
	public boolean transfere(double valorATransferir, Conta contaDestino) {
		if (this.saca(valorATransferir)) {
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}

}
