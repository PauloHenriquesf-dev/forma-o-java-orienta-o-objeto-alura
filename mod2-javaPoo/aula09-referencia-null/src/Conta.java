
public class Conta {
	
	double saldo; // poderia atribuir um valor a qualquer atributo, ex: saldo = 100, ai toda Conta Criada
	int agencia;  // ja teria seu saldo com valor 100, caso n faça isso. ao criar uma Conta os valores do
	int numero;   // seus atributos sao zerados de acordo com seus tipos.
	Cliente titular;
	
	public boolean saca(double valorASacar) {
		if (this.saldo >= valorASacar) {
			this.saldo = this.saldo - valorASacar;
			return true;
		} else {
			return false;
		}
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
