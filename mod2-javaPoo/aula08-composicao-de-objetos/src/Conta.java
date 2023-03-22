
public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	Cliente titular; //titular é uma referencia, ou seja ele aponta pra um objeto do tipo Cliente
	
	//String cpfDoTitular;       //sera que cpf é um dado da Conta?
	//String profissaoDoTitular; //sera que profissao é um dado da Conta?
	
	/* cpf, profissao e nome nao sao dados da Conta. 
	 * vamos criar uma classe Cliente que vai conter esses dados*/
	
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
		
		//verifica se é possivel sacar o valorATransferir
		if (this.saca(valorATransferir)) {	
			
			//depositando o valorATransferir na contaDestino:
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}
	
}
