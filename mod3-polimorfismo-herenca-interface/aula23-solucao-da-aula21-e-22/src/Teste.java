
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setSenha(2222);
		
		Administrador administrador1 = new Administrador();
		administrador1.setSenha(2222);
		
		//lembrnaod que senha interna do sietam é 2222
		SistemaInterno sistema = new SistemaInterno();
		sistema.checarAutenticacao(gerente1); // pode entar no sistema
		sistema.checarAutenticacao(administrador1); // pode entrar no sistema
		
		/* Nosso codigo continua funcionando normalmente,
		 * e agora esta sem repeticao e codigo. */
	}
}
