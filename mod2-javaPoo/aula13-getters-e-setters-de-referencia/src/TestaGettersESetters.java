
public class TestaGettersESetters {
	
	public static void main(String[] args) {
		
		//criando cliente Paulo:
		Cliente paulo = new Cliente();
		
		//criando uma Conta contaPaulo:
		Conta contaPaulo = new Conta();
		
		/* fazendo a seguinte atribuiçao:
		 * atributo titular da ContaPaulo deve-se guardar a referencia do obj paulo que é tipo Cliente:
		 * 
		 * Antes nos fazia assim:
		 * contaPaulo.titular = paulo;
		 * 
		 * Agora nao conseguimos mais dessa forma, pois o atributo titular de uma Conta é privado, ou seja
		 * apenas a Classe Conta pode ver esse atributo (titular).
		 * fora da classe Conta devemos acessa-los atraves de metodos getters e setters.
		 */
		
		//Agora deve atribuir o titular da Conta da seguinte forma:
		contaPaulo.setTitular(paulo);
		
		/* atribuindo valores para nosso Cliente (paulo):
		 * 
		 * lembrando: antes dos atributos da Classe cliente não serem privados, fazia da seguinte forma:
		 * paulo.nome = "Paulo"
		 * paulo.cpf = "111.111.111-11";
		 * paulo.profissao = "Programador";
		 * 
		 * Agora nao consiguimos mais dessa forma, so atravez de metodos getters e setters
		 * */
		
		//Agora deve "popular", ou seja atribuir valores a um Cliente da seguinte forma:
		paulo.setNome("Paulo");
		paulo.setCpf("111.111.111-11");
		paulo.setProfissao("Programador");
		
		//imprimir o nome do titular da contaPaulo:
		System.out.println(contaPaulo.getTitular().getNome());
		/* nosso getTitular() pega o valor do atributo titular,
		 * o valor do atributo titular é um endereço de memoria, ele aponta para um objeto do tipo Cliente
		 * e esse Cliente tem nome, cpf e profissao.
		 * Por ultimo é usado o getNome para pegar o nome daquele Cliente.
		 * */
		
		//vamos ver o valor do atributo titular da nossa contaPaulo:
		System.out.println(contaPaulo.getTitular()); //imprime endereço de memoria, ex: Cliente@58d25a40
		                                             //esse endereço de memoria é onde esta o objeto que
		                                             //a referencia paulo aponta.
		                                             //
		                                             //-Ao fazer: Cliente paulo = new Cliente();
		                                             //-esta sendo criando um objeto do tipo Cliente
		                                             //-e o endereço de onde esta esse Obj é guardado em paulo
		
		/* titular aponta para o mesmo obj em que paulo aponta pq a referencia paulo foi passada como
		 * argumento no metodo setTitular()
		 */
		
		// provando que a referencia paulo que foi passada como parametro no metodo setTitular()
		// tem o mesmo valor que o atributo titular da contaPaulo.
		// ou seja eles aponta para o mesmo objeto:
		
		System.out.println(paulo);                   // imprime Cliente@58d25a40
		System.out.println(contaPaulo.getTitular()); // imprime Cliente@58d25a40
		
		
		//caso queira trocar a profissao do titular da contaPaulo:
		contaPaulo.getTitular().setProfissao("Desenvolvedor Java"); //metodo get Pega, o set atribui valor
		                                                            //PEGA titular e ATRIBUI esse valor
		
		System.out.println(contaPaulo.getTitular().getProfissao()); // imprime Desenvolvedor Java
		
		
		//INTERESSANTE:
		Cliente novoCliente = contaPaulo.getTitular();
		novoCliente.setProfissao("Engenheiro de Software");
		
		//profissao da referencia paulo (que é um Cliente):
		System.out.println(paulo.getProfissao()); // imprime Engenheiro de Software
		
		//profissaao da referencia novoCliente:
		System.out.println(novoCliente.getProfissao()); // imprime Engenheiro de Software
		
		/* 1- perceba que a referencia paulo guardava a referencia de um objeto do tipo Cliente
		 *    e esse cliente tinha profissao "Programador".
		 * 
		 * 2- fizemos o atributo titular da contaPaulo apontar para esse mesmo objeto.
		 *    e atraves do contaPaulo.getTitular().setTitular("Desenvolvedor Java"); trocamos a profissao.
		 *    
		 * 3- foi criado um novoCliente e fizemos ele receber o mesmo valor do titular da contaPaulo,
		 *    lembrando que no atributo titular da contaPaulo tem o endereco de memoria do objeto Cliente
		 *    o mesmo Cliente que a referencia paulo aponta.
		 *    Logo esse novoCliente vai apotar para o mesmo Objeto.
		 *    
		 * 4- por isso quando troco a profissao APENAS no novoCliente.setProfissao("Engenheiro de Software");
		 *    troca a pŕofissao "pro dois"
		 *    
		 *    paulo.getProfissao()
		 *    novoCliente.getProfissao()
		 *    
		 *    Mas na verdade os dois apontam para o mesmo objeto. Por isso acontece isso
		 * */
	}
}
