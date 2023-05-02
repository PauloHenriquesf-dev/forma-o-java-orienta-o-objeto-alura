
public class Teste {
	
	public static void main(String[] args) {
		
		/* Uma nova regra de Negocios: o chefe agora quer saber quantas contas ja foram abertas
		 * olhando pro lado do código, queremos saber quantas contas foram INSTANCIADAS,
		 * quantas conta foram dada o NEW.
		 * 
		 * Ao da um new vai ser criado uma Conta, então na classe Conta podemos declarar um CONTADOR
		 * dentro do Construtor:
		 * 
		 * public Conta(int agencia, int numero) {
		 * 		int totalDeConta = 0;
		 * }
		 * e ficar incrementando-o totalDeConta++;
		 * 
		 * ISSO DA CERTO?
		 * 
		 * Não da certo por varios motivos, vamos focar apenas em um por enquanto:
		 * 
		 * 1: a variavel totalDeConta vai "morrer" dentro do Construtor, n da pra usar ela na nossa main.
		 * 
		 * solução: devemos colocar totalDeConta como um atributo, criar seus metodos get e set e ai sim
		 * ele n vai "morrer" no construtor. Podemos acessa-lo na em outras classes.
		 * E seu incremento colocaremos dentro do Construtor para que sempre que for criada uma conta
		 * somar +1.
		 * Ainda vai ter uma mensagem informando o total de contas Criadas.
		 * 
		 * */
		
		//criando 1 conta
		Conta conta1 = new Conta(11, 1111); //a mensagem do construtor diz que foi criado total de 1 conta
		
		//criando 2° conta:
		Conta conta2 = new Conta(22, 2222); //a mensagem do construtor diz que foi criado total de 1 conta
		
		//CUIDADO:
		/* perceba q mesmo colocando totalDeConta como atributo, resolvedo o problema de declara-lo dentro
		 * do construtor e ele morrer la. Ainda tem outro porblema:
		 * - ele ta sendo usado como um atributo do OBJETO, ou seja CADA conta criada vai ter um
		 * atributo totalDeConta que sempre é ZERO ai vai no construtor e soma +1
		 * 
		 * resumindo:
		 * criamos conta1 foi no construtor e totalDeConta que era ZERO passou a ser 1.
		 * criamos conta2 ela tambem vai ter o ATRIBUTO DELA totalDeConta que era ZERO e foi pra 1
		 * 
		 * SOLUÇÂO: devemos usar esse atributo totalDeConta como "static"
		 * dessa forma esse atributo vai ser da Classe e nao do objeto.
		 * é como se fosse um atributo compartilhado entre os objetos criados, ou seja os objetos criados
		 * NAO terão mais seu proprio atributo totalDeConta, a classe tera apenas um atributo totalDeConta
		 * e vai compartilha-lo entre todos os objetos criados.
		 * 
		 * (sera feito na aula17).
		 * 
		 * */
		
		
	}
}
