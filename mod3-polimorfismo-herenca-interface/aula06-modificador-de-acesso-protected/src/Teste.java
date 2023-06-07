
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setSalario(5000);
		
		Funcionario func1 = new Funcionario();
		func1.setSalario(3000);
		
		//bonificacao do Gerente e do Funcionario:
		System.out.println(gerente1.getBonificacao()); //imprime 250.0 (5% do salario)
		System.out.println(func1.getBonificacao());    //imprime 300.0 (10% do salario)
		
		
		/* OBS:
		 * =-=-=-=-= PROTECTED (ATRIBUTOS E METODOS) =-=-=-=-=
		 * CLASSES DENTRO DO MESMO PACOTE...........É visivel
		 * CLASSES EM PACOTES DIFERENTES............NAO é visivel
		 * CLASSES (FILHAS) EM PACOTES DIFERENTES...É visivel
		 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=
		 */
		
		
		/* Apesar do atributo SALARIO esta como PROTECTED na classe FUNCIONARIO
		 * a nossa MAIN (classe Teste) NAO esta em pacote diferente da classe Funcionario
		 * dessa forma é possivel acessar o atributo SALARIO de forma direta,
		 * isso não é legal mas por enquanto vai ficar assim. Logo mais vamos consertar isso.
		 */
		
		//acessando de forma direta:
		System.out.println(gerente1.salario); //imprime 5000.0
		System.out.println(func1.salario);    //imprime 3000.0
	}
}
