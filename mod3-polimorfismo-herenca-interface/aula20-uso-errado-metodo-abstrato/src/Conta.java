/* Classe abstrata é criada quando deseja fornecer uma estrutura base para outras classes
 * relacionadas, mas não deseja permitir que a própria classe abstrata seja instanciada.
 * Em outras palavras, uma classe abstrata é uma classe que não pode ser usada
 * para criar objetos, mas pode ser usada como base para outras classes que a estendem.
 * 
 * 
 * */
public abstract class Conta {
	
	//classes abstratas podem ter atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeConta;
	
	//classes abstratas podem ter construtor
	public Conta(int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
		} else {
			Conta.totalDeConta++;
			this.agencia = agencia;
			this.numero = numero;
		}
	}
	
	//classes abstratas podem ter metodos concretos (metodos com implementacao)
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

	public boolean sacar(double valorASacar) {
		if (this.saldo >= valorASacar) {
			this.saldo -= valorASacar;
			return true;
		}
		return false;
	}
	
	// Deixando o metodo deposita abstract
	// (As classes filhas agora sao obrigadas a implementar esse metodo)
	public abstract void deposita(double valorADepositar);
	
	/* O metodo "deposita" tem uma implementação padrão em todas as classes filhas,
	 * logo não é viavel tornalo um método abstrato.
	 * 
	 * A utilização de métodos abstratos deve ser reservada para situações em que as 
	 * classes filhas precisam fornecer implementações específicas para o método,
	 * como suas classes filhas não tem uma implementação especifica cada uma p/ esse metodo
	 * ou seja a implementacao é a mesma, é melhor deixar esse metodo concreto
	 * na classe mae */
	
	
	
	public boolean transfere(double valorATransferir, Conta contaDestino) {
		if (this.sacar(valorATransferir)) {
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeConta;
	}

}