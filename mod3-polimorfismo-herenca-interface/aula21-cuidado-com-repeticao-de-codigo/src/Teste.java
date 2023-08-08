
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setSenha(2222); // senha do gerente 1
		
		Gerente gerente2 = new Gerente();
		gerente2.setSenha(1111); // senha do gerente 2
		
		Administrador administrador1 = new Administrador();
		administrador1.setSenha(2222);
		
		SistemaInterno sistema = new SistemaInterno();
		//lembrando que a senha do sistema interno é 2222
		
		sistema.checarAutenticacao(gerente1); // Pode entrar no sistema
		sistema.checarAutenticacao(gerente2); // Nao pode entrar no sistema
		sistema.checarAutenticacao(administrador1); // Pode entrar no sistema
		
		
	}
}
