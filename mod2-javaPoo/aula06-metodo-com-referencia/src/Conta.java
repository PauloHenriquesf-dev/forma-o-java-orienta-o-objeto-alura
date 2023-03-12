
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
	
	/* Esse metodo transfere recebe 2 parametros
	 * valorATrasferir: que sera o total do dinheiro que quero trasferir
	 * contaDestino: que sera uma Conta para a qual quer transferir dinheiro
	 * OBS: nao precisa receber no parametro qual a conta que ta transferindo, pois quando
	 * é invocado o metodo transfere nos usamos a referencia para invoca-lo. Ou seja a propria
	 * referencia ja esta orientando qual o objeto que vai ser responsavel por transferir*/
	
	public boolean transfere(double valorATransferir, Conta contaDestino) {
		if (this.saldo >= valorATransferir) {      //se o saldo dessa Conta(this) for >= valorATrasferir
			this.saldo -= valorATransferir;        //subtrai o valor do saldo dessa conta(this)
			contaDestino.saldo += valorATransferir;//soma o valor no saldo da conta passada no parametro
			return true;                           //retorna true avisando que deu certo
		} else {
			return false;                          //se nao retorna falso
		}
		//OBS: onde tem "this" informar que se refere a Conta que foi invocada o metodo
	}
	
}
