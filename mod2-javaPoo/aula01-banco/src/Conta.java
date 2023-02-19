//Caso tenha alguma duvida, fazer o curso da Alura (Formaçao Java Orientaçao Objetos)
//Lá os cara explica tudo de fomra muito mais detalhada, aqui estou fazendo bem por cima.

/* Criando classe Conta: ainda nao chega a ser uma conta e sim a expecificaçao de uma conta
 * é como se fosse a planta de uma casa que nao chega a ser uma casa em si.
 * Atraves da planta da casa podemos fazer/criar varias casas. 
 * Logo atraves dessa classe Conta podemos criar varias Contas (objetos do tipo Conta).
 * */
public class Conta {
	//atributos (o que tem em um conta)
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//comportamento ou metodos (o que vc pode fazer com uma conta)
	
	public void saca(double valorASacar) {
		
	}
	
	public void deposita(double valorADepositar) {
		
	}
	
	public void transfere(double valorATransferir, Conta contaDestino) {
		
	}
	
	//OBS: para iniciar um programa em Java precisa ter o ponto de entrada:
	//public static void main(String[] args) { ... }
}
