
public class Conta {
	
	private double saldoPrivado; //atributos privados so podem ser modificados e lidos pela propria classe 
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public boolean saca(double valorASacar) {
		if (this.saldo >= valorASacar) {
			this.saldo = this.saldo - valorASacar;
			return true;
		} else {
			return false;
		}
	}
	
	//saca em saldoPrivado
	public boolean sacaPrivado(double valorASacar) {
		if (this.saldoPrivado >= valorASacar) {
			this.saldoPrivado -= valorASacar;
			return true;
		}
		return false;
	}
	
	public void deposita(double valorADepositar) {
		this.saldo += valorADepositar;
	}
	
	//deposita em saldoPrivado
	public void depositaPrivado(double valorADepositar) {
		this.saldoPrivado += valorADepositar;
	}
	
	//metodo para informar o valor de saldoPrivado
	public double pegaSaldoPrivado() {
		return this.saldoPrivado;
	}
	
	public boolean transfere(double valorATransferir, Conta contaDestino) {
		if (this.saca(valorATransferir)) {	
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}
	
}
