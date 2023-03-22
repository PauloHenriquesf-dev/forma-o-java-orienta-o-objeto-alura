
public class TestaBanco {
	
	public static void main(String[] args) {
		
		//criando um titular que é do tipo Cliente (cliente1 é uma referencia ao Cliente criado)
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Paulo";
		cliente1.cpf = "111.111.111-11";
		cliente1.profissao = "Desenvolvedor Java";
		
		//criando uma Conta (contaDoCliente1 é uma referencia ao objeto criado que é do tipo Conta)
		Conta contaDoCliente1 = new Conta();
		contaDoCliente1.deposita(100);
		
		/* Temos um "titular" do tipo Cliente e temos uma Conta, agora como fazer para
		 * o tipo Cliente se relacionar com Conta?
		 *  
		 * foi feito o seguinte: em um dos atributos da classe Conta "titular" colocamos seu tipo Cliente:
		 * 
		 * public Class Conta {
		 * 		... 
		 * 		Cliente titular   //titular vai apontar para um objeto do tipo Cliente (sera uma referencia) 
		 * 		...
		 * 
		 * }
		 * 
		 * */
		
		
		contaDoCliente1.titular = cliente1; // fazendo a composição de objetos
		
		/*o q foi feito: contaDoCliente1 -aponta p/ uma Conta->  Conta
		 *                                                      (saldo)
		 *                                                     (agencia)
		 *                                                      (numero)
		 *                                                     (titular) -aponta p/ um Cliente-> Cliente
		 *                                                                                       (nome)
		 *                                                                                       (cpf)
		 *                                                                                    (profissao)
		 *
		 *OBS: contaDoCliente1 aponta pra uma Conta e o titular dessa Conta aponta pro Cliente criado (Cliente1)
		 */
		
		//imprimindo o nome do cliente da Conta:
		System.out.println(contaDoCliente1.titular.nome); // Paulo
		
		//titular da contaDoCliente1 esta apontando para o mesmo objeto que a variavel cliente1 aponta:
		
		System.out.println(contaDoCliente1.titular); // imprime algo do tipo: Cliente@58d25a40
		System.out.println(cliente1);                // imprime algo do tipo: Cliente@58d25a40
		
		//perceba que contaDoCliente1.titular aponta para o mesmo endereço q cliente1 aponta
		//pois fizemos a composicao desses objetos: contaCliente1.titular = cliente1.
		//fizemos o titular da nossa Conta apontar para o mesmo endereço que cliente1 aponta.
	}
}
