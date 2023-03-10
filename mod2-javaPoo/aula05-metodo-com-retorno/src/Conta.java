
public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	/* no metodo saca precisamos passar como parametro um valor a sacar
	 * OBS: nao precisa informar de qual conta vc quer sacar, pois ja estamos "conversando"
	 * com o objeto expecifico, ja estamos ORIENTADO A UM OBJETO"
	 * 
	 * EX:
	 * - lembra que ao fazer:                            Conta() contaExemplo = new Conta();
	 * - e chamar o metodo saca atravez da referencia:   contaExemplo.saca(100);
	 * 
	 * já sabemos que o saca sera do objeto do tipo Conta no qual contaExemplo aponta.
	 * por isso nao precisa passar qual a Conta, apenas o valor que deseja sacar.
	 * */
	
	//nosso saca metodo retorna um boolean (true ou false)
	public boolean saca(double valorASacar) {
		if (this.saldo >= valorASacar) {            //se saldo da conta é maior ou igual ao valor a sacar
			this.saldo = this.saldo - valorASacar;  //entao subtrai do saldo o valor a sacar
			return true;                            //e retorna verdadeiro avisando que deu certo o saque.
		} else {          //caso contrario (saldo < valorASacar) 
			return false; //retorna falso (avisando que o saque nao foi possivel)
		}
	}
	
	public void deposita(double valorADepositar) {
		this.saldo += valorADepositar; 
	}
	
	public void transfere(double valorATransferir, Conta contaDestino) {
		
	}
	
}
