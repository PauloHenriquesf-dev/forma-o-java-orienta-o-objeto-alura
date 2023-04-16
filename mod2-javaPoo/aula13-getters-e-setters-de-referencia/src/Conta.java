
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/* COMO O ATRIBUTO TITULAR É PRIVADO, CRIA-SE METODO GETTER E SETTER
	 * PARA PODER ACESSAR E ATRIBUIR VALORES NO ATRIBUTO TITULAR FORA DA CLASSE CONTA*/
	
	
	//Lembrando que titular é um atributo da classe Conta, e seu valor é uma referencia, ou seja
	//ele guarda o endereço de memoria de um objeto do tipo Cliente, logo esse metodo retorna um Cliente
	public Cliente getTitular() {
		return this.titular;
	}
	
	//Esse metodo recebe uma referencia, ou seja recebe o endereço de memoria onde
	//esta um objeto do tipo Cliente
	public void setTitular(Cliente titular) {
		this.titular = titular;// fazendo o atributo 'titular' apontar para o mesmo endereço de memoria
		                       // que a referencia pasada como parametro aponta.(Apontando p/ o mesmo obj)
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
