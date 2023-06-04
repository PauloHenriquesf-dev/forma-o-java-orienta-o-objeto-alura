
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		
		// Como foi usando o Extends (heranca) Agora Gerente é um Funcionario
		// entao Gerente tem os metodos getters e setter que Funcionario tem:
		
		gerente1.setNome("Henrique");
		gerente1.setCpf("111.111.111-11");
		gerente1.setSalario(5000);
		
		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());
				
		// definindo uma senha para Gerente atraves do metodo setSenha() q é um metodo especifico de Gerente
		// ou seja nao foi Herdado da classe Funcionario.
		gerente1.setSenha(2222);
		
		// criando uma variavel que sera a senha de autenticação,
		// apenas funcionarios com essa senha poderam entrar no sistema.
		int senhaDeAutenticacao = 2222;
		
		// Verificando se gerente1 é autenticavel:
		// o metodo autentica é um metodo especifico de Gerente, nao foi herdado de Funcionario
		
		System.out.println(gerente1.autentica(senhaDeAutenticacao)); //imprime true
	}
}
