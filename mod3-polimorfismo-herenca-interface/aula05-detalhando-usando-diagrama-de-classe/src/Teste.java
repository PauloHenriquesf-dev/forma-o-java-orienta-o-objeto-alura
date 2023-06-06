public class Teste {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente();
		/*
		 * Ao criar o Gerente o que acontece "por baixo dos panos" é q nesse objeto
		 * criado é baseado todos os atributos da Hierarquia (Funcionario Mae de Gerente)
		 * Logo Gerente tera todos os atributos e metodos herdados da Mae (Funcionario)
		 * alem dos seus atributos especificos como senha e metodos especificos como
		 * autentica, que saõ apenas de Gerente.
		 */

		gerente1.setNome("Henrique");      // setNome e nome sao herdados de Funcionario
		gerente1.setCpf("111.111.111-11"); // setCpf e cpf sao herdados de Funcionario
		gerente1.setSalario(5000);         // setSalario e salario sao herdados de Funcionario

		gerente1.setSenha(2222); // setSenha e senha sao especifico de Gerente

		
		// Conclusao: apesar de na classe Gerente ter apenas:
		// um atributo declarado: senha e um metodo: getSenha()
		// essa classe vai possuir todos os atributos e metodos de Funcionario
		// pois foi usando um extends na classe Gerente.
		// Gerente Herdou tudo da classe Funcionario
	}
}