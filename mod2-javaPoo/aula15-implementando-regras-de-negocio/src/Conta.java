
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	/*se vc nao escreve nenhum construtor o java te da o construtor padrao, que é assim:
	 * 
	 * public Conta() {
	 *
	 * }
	 * 
	 * O construtor é de um obj é executado apenas uma vez quando vc construi o Objeto (dando o "new").
	 * -Se vc construi um construtor o Java nao dte da mais o Construtor Padrao.
	 * -vc pode construir varios Construtores diferentes
	 */
	
	
	//criando nosso construtor baseado na regra de noegocio: NAO pode conta com Agencia e Numero <= ZERO
	//nosso Construtor recebe 2 valores: um para agencia o outro para numero
	//e esse construtor é invocado quando criamos o objeto com o NEW
	public Conta(int agencia, int numero) {
		//verificar se os valores passados no parametro sao MAIORES que ZERO
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia e Numero da Conta devem ter valores MAIOR que ZERO");
		} else {
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
