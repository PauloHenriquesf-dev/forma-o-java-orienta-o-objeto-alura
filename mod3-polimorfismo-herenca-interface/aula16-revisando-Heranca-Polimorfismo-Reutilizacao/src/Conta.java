
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeConta;
	
	public Conta(int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
		} else {
			Conta.totalDeConta++;
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
	
	// Nesse metodo tem POLIMORFISMO, um dos parametros "contaDestino" é do tipo Conta,
	// Esta sendo usado um tipo mais Generico e pode receber outros tipos mais especificos
	// como ContaCorrente e ContaPoupanca
	public boolean transfere(double valorATransferir, Conta contaDestino) {
		if (this.saca(valorATransferir)) {
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeConta;
	}

}