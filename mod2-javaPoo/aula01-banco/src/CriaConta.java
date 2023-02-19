
public class CriaConta {
	
	public static void main(String[] args) {
		
		/* como tirar a expecificaçao Conta e criar realmente uma conta?
		 * atravez da palavra chave: new
		 * new é utilizado para criar uma nova instância de uma determinada classe (no seu caso Conta).
		 * Imagine que a planta de uma casa é a classe e uma casa construída a 
		 * partir dessa planta seria a instância dessa classe - um novo objeto.
		 */
		
		new Conta();
		//acima foi instanciado uma Conta/ criado um objeto do tipo Conta atraves do new
		// so que dessa forma nao temos uma variavel para guardar/apontar para esse objeto
		
		
		//vamos guardr o new Conta() dentro de uma variavel do seu tipo.
		//o new ele retorna uma referencia ou seja vamos guardar algo q referencia aquele objeto
		Conta c1 = new Conta();
		
		//OBS: quando foi dado new no objeto, dentro de c1 nao tem esse objeto, mas sim uma referencia pra ele
		//ou seja a variavel c1 aponta para aquele objeto
		
		
		//atribuindo 200 reais ao saldo da nossa conta:
		c1.saldo = 200;
		
		//imagine o ponto como se fosse uma setinha.
		//c1 ta indo na conta que ele aponta, e atraves do ponto ele vai no atributo saldo e joga 200 la
		
		//imprimindo o saldo
		System.out.println(c1.saldo);
	}
}
