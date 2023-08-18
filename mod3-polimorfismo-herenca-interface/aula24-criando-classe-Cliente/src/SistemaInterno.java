
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void checarAutenticacao(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(senha);
		
		if (autenticou) {
			System.out.println("pode entrar no sistema!");
		} else {
			System.out.println("Não pode entrar no sistema!");
		}
	}
}
