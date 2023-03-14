
public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
		//para sacar o valor da conta a ser transferido era feito isso:
		//if (this.saldo >= valorATransferir) {
			//this.saldo -= valorATransferir;
		
		//substituindo pelo o metodo sacar q caso o dinheiro seja sacado retorna true, se n retorna false:
		if (this.saca(valorATransferir)) {	
		
		//contaDestino.saldo += valorATransferir; //isso pode ser substituido pelo o metodo depositar
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}
	
}
