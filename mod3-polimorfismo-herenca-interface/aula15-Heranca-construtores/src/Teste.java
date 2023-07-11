
public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(11, 1111);
		
		/* o que foi feito:
		 * 
		 * new ContaCorrente(11, 1111)
		 * chama o contrutor que recebe 2 parametros da ContaCorrente
		 * 
		 * dentro do construtor da ContaCorrente q recebe 2 parametros, atraves do "super"
		 * é chamado o construtor da sua classe mae, passando os 2 valores recebidos
		 * como parametro.
		 * 
		 * é executado toda a logica do construtor da clsse mae e retorna p/ construtor da
		 * classe filha.
		 * Depois de terminar a execucao do construtor da casse filha o objeto é criado.
		 * 
		 * E esse objeto criado é referenciado pela variave "cc1"
		 * */
		
	}
}
