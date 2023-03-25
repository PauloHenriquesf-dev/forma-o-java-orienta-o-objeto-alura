
public class Conta {
	
	private double saldo; // atributos privados apenas a sua classe pode acessar-lo e atribuir valores
	int agencia;
	int numero;
	Cliente titular;
	
	//precisamos criar metodo para poder acessar o saldo e informar seu valor, pode ser qualquer nome,
	//mas por convenção usamos get+nomeDoAtributo.
	public double getSaldo() {
		return this.saldo;
	}
	
	//podemos criar um metodo para acesar saldo e atribuir um valor, pode ser qualquer nome,
	//mas por convenção usamos set+nomeDoAtributo.
	//- metodo set precisa receber parametros, nesse caso ele receberá um double,
	//  esse valor sera atribuido no atributo saldo.
	public void setSaldo(double saldo) {
		this.saldo = saldo; //saldo esquerdo é nosso atributo, o saldo direito é o argumento passado
	}
	
	/*OBS: nem sempre é necessario criar metodos getters e setters.
	 *Por exemplo vc nao vai atribuir um valor para o saldo de uma conta bancaria,
	 *seu valor deve ser alterado com saques e depositos,
	 *porem foi criado o metodo setter para mostrar como funciona.
	*/
	
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
