
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		/* como estavamos criando um objeto:
		 * 
		 ******** DO LADO DIREITO *************
		 * a palavra new com o nome da classe p/ chamar o construtor
		 * 
		 * new Gerente();
		 *
		 * 
		 ******** DO LADO ESQUERDO **************
		 * define o tipo da variavel usando antes dela o nome da cLasse
		 * 
		 * Gerente gerente1
		 *
		 * 
		 ********* OS DOIS LADOS JUNTOS *************
		 * 
		 * (lado esquerdo)    (lado direitor) 
		 * Gerente gerente1 = new Gerente();
		 * 
		 */
		
		// Ja que um Gerente é um Funcionario (extends Funcionario),
		// Pode dar um new Gerente() e do lado esquerdo nossa variavel ser do tipo Funcionario:  
		
		
		Funcionario gerente2 = new Gerente(); // variavel agora é de um tipo mais generico
		gerente2.setNome("Henrique");
		
		System.out.println(gerente2.getNome()); // imprime Henrique
		
		/* Deu certo pois Gerente é um Funcionario
		 * (Funcionario é mais Generico, pode ter algo mais GENERICO do lado esquerdo)
		 *
		 * Cuidado, se fizer o contrario nao Funciona:
		 * Gerente gerente1 = new Funcionario();
		 *
		 * Gerente é um Funcionario, mas nem todo Funcionario vai ser um Gerente.
		 * (Nao da certo do lado esquerdo ter algo ESPECIFICO e do lado direito algo GENERICO)
		 * A não ser que use um CAST.
		 */
		
		
		// Lembra que GERENTE tem um metodo 'autentica()' vamos tentar invoca-lo:
		
		//gerente2.autentica(2222);  // nao da certo
		
		/* Mas pq nao da certo? se foi dado um 'new Gerente()' do lado direito,
		 * ou seja o objeto que foi criado é do tipo Gerente().
		 * 
		 * Isso n importa pro compilador, ele vai analisar o tipo da REFERENCIA (lado esquerdo)
		 * - nossa referencia é 'gerente2' e seu tipo é FUNCIONARIO
		 * e em Funcionario NAO TEM O METODO 'autentica()'
		 * 
		 * Por isso nao da certo de invocar esse metodo por 'gerente2'.
		 */ 
		
		/*     *********** IMPORTANTE ***********************
		 * Ao dar o 'new Gerente()' cria um objeto do tipo Gerente
		 * o objeto SEMPRE vai ter o mesmo tipo.
		 * O que pode VARIAR é o tipo da REFERENCIA (lado esquerdo).
		 * 
		 * EX:
		 * Funcionario gerente1 = new Gerente();
		 *            
		 *            ou
		 *            
		 * Gerente gerente1 = new Gerente();
		 * 
		 * Voce tem o MESMO objeto do tipo Gerente, mas voce tem 2 ou mais formas de
		 * chegar nesse mesmo objeto. (tem varias formas de referencia-lo)
		 * 
		 * - ISSO É POLIMORFISMO
		 *********************************************************
		 * */
	}
}
