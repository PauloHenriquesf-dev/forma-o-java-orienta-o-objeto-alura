/* A classe MAE da ContaCorrente, que é a classe Conta possui um construtor especifico
 * que recebe 2 parametros. Como a herança NAO HERDA Construtores devemos criar um que
 * receba dois parametros tambem do mesmo tipo que o construtor da classe Conta e invocar
 * seu construtor atraves da palavra "super" passando os valores dos parametros.*/

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
}
