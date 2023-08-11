
public class SistemaInterno {
	
	private int senha = 2222; // senha do sistema interno
	
	// checarAutenticacao agora recebe um Funcionario, Assim atraves do Polimorfismo
	// evita criar varios metodos passando parametros diferente como Gerente e Administrador
	
	public void checarAutenticacao(Funcionario gerente) {
		
		boolean autenticou = gerente.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no Sistema");
		} else {
			System.out.println("Não pode entrar no Sistema");
		}
	}
	
	// foi apagado o metodo "checarAutenticacao(Gerente gerente) { ... }
	// foi apagado o metodo "checarAutenticacao(Administrador administrador){ ... }
}
