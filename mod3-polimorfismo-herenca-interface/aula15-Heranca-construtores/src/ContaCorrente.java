/* Ao usar o extends vai herdar ATRIBUTOS e METODOS, mas NÃO herda CONSTRUTORES 
 * 
 * uma classe filha não herda automaticamente o construtor da classe mae.
 * Se a classe filha não definir explicitamente um construtor,
 * ela terá um construtor PADRÃO (sem argumentos) fornecido implicitamente pelo compilador.
 * Agora, se a classe mae tiver um construtor com argumentos e vc quiser que a classe filha
 * o utilize, será necessário definir um construtor na classe filha e
 * chamar explicitamente o construtor da classe mae usando a palavra-chave "super".
 * 
 * */

public class ContaCorrente extends Conta {
	
	/* Quando for criar um objeto do tipo ContaCorrente: new ContaCorrente()
	 * será chamado o contrutor Padrao (se nao conter nenhum outro construtor nessa classe)
	 * 
	 * ex do construtor padrao: 
	 * public ContaCorrente() {
	 * 
	 * }
	 * OBS: se vc nao criou nenhum contrutor esse construtor ja existe implicitamente.
	 * E sempre é chamado ao dar um "new"
	 * 
	 * PROBLEMA: la na classe mae (CONTA) criamos um construtor especifico, e ela n tem
	 * um construtor PADRAO.
	 * Ao tentar criar um objeto do tipo ContaConrrente, vai ser chamado o contrutor PADRAO,
	 * ja que toda classe que n tem um construtor especifico criado,
	 * tem um construtor padrao (sem parametros) implicitamente.
	 * O Problema é que ta sendo usado herança, logo dentro do construtor PADRAO da classe
	 * ContaCorrrente, vai tentar chamar o construtor padrao da Classe mae (Conta) atraves
	 * do "super" da seguinet maneira:
	 * 
	 * 1- cria um objeto do tipo ContaCorrente:
	 * new ContaCorrente();
	 * 
	 * 2- ja q conta corrente n tem construtor, é chamado o construtor padrao implicitamente:
	 * public ContaCorrente() {
	 * 
	 * }
	 * 
	 * Acontece que ta usando a Heranca, como uma ContaCorrente é uma Conta,
	 * esse construtor padrao da classe ContaCorrente vai chamar o construtor Padrao da
	 * classe mae (Conta) atraves do "super"
	 * 
	 * 3- construtor padrao da ContaCorrente chama construtor padrao de Conta
	 * public ContaCorrente() {
	 * 		super();
	 * }
	 *  
	 * PROBLEMA: no (3-) vai ocorrer um problema, na classe Conta foi criado
	 * um construtor especifico, logo ela perde seu construtor PADRAO, a nao ser que vc crie
	 * explicitamente.
	 * Entao como podemos resolver esse problema?
	 * 
	 * A) criar um construtor padrao na classe mae
	 * B) usar o super dentro do construtor da classe filha passando os devidos parametros
	 * ou seja chamando o construtor especifico da classe mae atraves do "super".
	 * 
	 * Vai depender o que vc quer, mas pode resolver tanto com A) quando com B)
	 * */
	
	// seguindo B) o construtor agora recebe uma agencia e numero como na classe Conta (mae)
	// e depois atraves do super chama o construtor especifico da classe mae
	// passando os parametros.
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
}
