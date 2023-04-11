
public class Conta {
	
	//o ideal é que todos seus atributos sejam PRIVADOS, existe caso que n precisa, porem é raro.
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	/*OBS: IMPORTANCIA DE ATRIBUTOS PRIVADOS:
	 * Digamos que vc usou numero da conta privado, pode ser q futuramente seu chefe fale:
	 * - "Olha antigamente podia numero de conta negativo, agora nao pode mais."
	 * como atributo numero n era privado, varias outras classes podem ter tido acessado ele.
	 * Agora para vc implementar essa nova regra é preciso ir em varios locais para saber onde o acessaram
	 * e fazer a implementação.
	 * SE O ATRIBUTO NUMERO FOSSE PRIVADO, BASTAVA ALTERAR A REGRA NA CLASSE ONDE PERTENCE O ATRIBUTO, JÁ
	 * QUE ATRIBUTOS PRIVADOS SO PODEM SER ACESSADO PELA SUA CLASSE DE ORIGEM. As demais classe tem acesso
	 * a esse atributo privado por metodos getters e setter.
	 * LOGO O BOM DE USAR PRIVADO É SE ALGUM DIA PRECISAR FAZER ALGUMA ALTERAÇÃO, FAZ EM APENAS UM LUGAR.
	 * */
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	//Até o setNumero permite receber numero de conta Negativo, porém se quiser implementar a nova regra
	//para que as contas n tenham numero negativos, basta implementar a mudança nesse metodo.
	//n é preciso sair buscando em outras classes e checar onde acessaram o atributo numero e implementar
	//a mudança lá, como numero é PRIVADO, outras classes so poderam acessa-lo através do metodo setNumero
	//Logo so é preciso fazer a alteração da nova regra no metodo setNumero.
	public void setNumero(int numero) {
		this.numero = numero;
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
