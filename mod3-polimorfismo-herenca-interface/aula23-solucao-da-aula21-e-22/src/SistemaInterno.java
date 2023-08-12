
public class SistemaInterno {
	
	private int senha = 2222; // senha do sistema interno
	
	// recebe tipo autenticavel, dessa forma fica mais restrito.
	// Quem é apenas Funcionario nao pode ser passado no parametro,
	// apenas se for Autenticavel.
	// ou seja Gerente e Administrador pode, EditorDevideo e Designer Não.
	// Problema resolvido.
	public void checarAutenticacao(Autenticavel funcionarioAutenticavel) {
		
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no Sistema");
		} else {
			System.out.println("Não pode entrar no Sistema");
		}
	}
	
}
