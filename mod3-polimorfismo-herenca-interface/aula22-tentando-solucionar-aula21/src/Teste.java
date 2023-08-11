
public class Teste {
	
	public static void main(String[] args) {
		
		// Lembrando que apenas Gerente e Administrador podem se autenticar,
		// para entrar no sistema interno
		
		Gerente gerente1 = new Gerente();
		gerente1.setSenha(2222);
		
		Administrador administrador1 = new Administrador();
		administrador1.setSenha(2222);
		
		// senha do sistemaInterno é 2222
		SistemaInterno sistema = new SistemaInterno();
		
		sistema.checarAutenticacao(gerente1); // pode entrar
		sistema.checarAutenticacao(administrador1); // pode entrar
		
		//problema: apenas administrador e gerente pode ter autenticacao p/ entrar no sistema
		// mas um EditorDeVideo por exemplo tambem esta podendo
		EditorDeVideo editor = new EditorDeVideo();
		editor.setSenha(2222);
		
		sistema.checarAutenticacao(editor); // pode entrar.
		
		
		/* PROBLEMAS E SOLUÇÕES:
		 * 
		 * 1: foi removido o trecho de codigo responsavel pela autenticacao que tinha em
		 * Gerente e Administrador e implementado em Funcionario.
		 * Já que Gerente e Administrador herdam de Funcionario, terão essa autenticação.
		 * 
		 * PROBLEMA1: Outras classes tambem herdam de Funcionario, como Designer e
		 * EditorDeVideo, logo eles que nao poderiam ter acesso ao sistema interno,
		 * poderao ter.
		 * 
		 * 2: Para evitar ter varios metodos "checarAutenticacao" na classe SistemaInterno
		 * usamos o Polimorfismo. Ja  que o Polimorfismo permite que uma mesma operação pode
		 * ser realizada por diferentes objetos de classes diferentes.
		 * Entao passamos como parametro a classe Funcionario:
		 * checarAutenticacao(Funcionario funcionario) { ... } Assim pode ser passado
		 * Gerente e Administrador.
		 * 
		 * PROBLEMA2: A classe Funcionario tem outras filhas como Designer e EditorDeVideo
		 * Essas outras filhas nao devem ter autenticacao.
		 * 
		 * SOLUCAO:
		 * 1: Criar uma classe intermediaria, passar para essa classe o codigo que
		 * estava duplicado e foi passado para Funcionario, para tirar a repeticao.
		 * E fazer Administrador e Gerente herdar dessa classe intermediaria e
		 * Nao herdar mais de Funcionario.
		 * 
		 * 2: No metodo "checarAutenticacao"  da classe SistemaInterno nao passa mais um
		 * Funcionario como parametro e sim a nova classe intermediaria. 
		 * */
	}
}
