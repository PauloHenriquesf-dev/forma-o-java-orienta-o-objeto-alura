
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		//criando um objeto com uma referencia para ele (contaPaulo é uma referencia p/ o objeto)
		Conta contaPaulo = new Conta();
		
		/* OBS: se nao atribuir valores para os atributos,
		 * todos os atributos da conta sao ZERADOS de acordo com o tipo deles.
		 * int = 0, double = 0.0 , String = null, etc...
		 * e um tipo Conta, ou um tipo Cliente? para esses tipos sera NULL (referencia para lugar nenhum)
		 */
		
		//ver o valor do atributo titular da contaPaulo:
		System.out.println("Valor do atributo 'titular' = " + contaPaulo.titular); // imprime null
		
		//tentando atribuir um nome pro atributo titular da contaPaulo:
		//contaPaulo.titular.nome = "Paulo"; -----> vai da uma exception (é como se fosse um erro)
		
		/* ocorrera um erro em:  contaPaulo.titular.nome = "Paulo";  pois o titular da contaPaulo aponta 
		 * "para nada", seu valor é null. Para resolver isso precisamos que ele aponte para um objeto
		 * do tipo Cliente.
		 */
		
		//criando um cliente:
		Cliente cliente1 = new Cliente();
		
		//fazendo o atributo titular da contaPaulo apontar para cliente1:
		contaPaulo.titular = cliente1;
		
		//agora sim podemos atribuir um nome para o atributo titular da contaPaulo:
		contaPaulo.titular.nome = "Paulo";
		
		System.out.println("Nome do titular da ContaPaulo: " + contaPaulo.titular.nome); //imprime Paulo
		
		//OBS: podemos atribuir um Cliente de forma direta ao atributo titular de uma Conta:
		Conta contaHenrique = new Conta();
		
		contaHenrique.titular = new Cliente(); // nao precisou fazer Cliente cliente2 = new Cliente();
		contaHenrique.titular.nome = "Henrique";
		
		System.out.println("Nome do titular da ContaHenrique: " + contaHenrique.titular.nome);//imprime Henrique

		/* quando é feito Cliente cliente2 = new Cliente();
		 * do lado esquerdo estamos criando uma referencia do tipo Cliente
		 * que aponta para o objeto Cliente criado do lado direito.
		 * porem o atributo titular de uma Conta seu tipo é Cliente,
		 * ou seja ele pode apontar para um objeto Cliente, ele vai referenciar esse objeto Cliente,
		 * por isso é possivel fazer:  contaHenrique.titular = new Cliente();
		 */
		
	}
}
