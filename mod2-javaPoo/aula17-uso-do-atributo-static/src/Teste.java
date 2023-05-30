
public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(11, 2222);
		
		// ao ser criado uma conta vai iniciar seu construtor e no contrutor da classe Conta
		// foi implementado algo para informar quantas contas foram criadas
		
		// por enquaanto vai imprimir imnformando que tem o total de 1 conta criada
		
		Conta conta2 = new Conta(22, 3333);
		
		// inofrma que tem 2 contas criadas
		
		Conta conta3 = new Conta(33, 1111);
		
		//informa que tem 3 contas criadas
		
		
		/* Antes o atributo da classe Conta: totalDeConta quando n era STATIC o que acontecia era que:
		 * ao fazer
		 * 
		 * Conta conta1 = new Conta(11, 2222);
		 * 
		 * era incrementado ++1 no atributo totalDeConta, mas no totalDeConta de conta1.
		 * ao fazer:
		 * 
		 * Conta conta2 = new Conta(22, 3333);
		 * 
		 * era incrementado ++1 no atributo totalDeConta, mas no totalDeConta de conta2.
		 * 
		 * Agora com o uso do STATIC conta1, conta2 e conta3 estao compartilhando do mesmo totalDeConta
		 * elas nao possuem mais seu PROPRIO totalDeConta.
		 * 
		 * por isso agora sabemso q o totalDeConta = 3
		 * */
		
		/* Conseguimos ver o total de conta pois foi implementado no construtor que seria impresso
		 * a quantidade de contas criadas.
		 * Porem tirando essa parte do System.out.println() do construtor
		 * que mostra o total de contas criadas
		 * como poderiamos chamar o totalDeConta que é STATIC aqui na MAIN?
		 * sera visto na aula 18*/
		
	}
}
