
public class SistemaInterno {
	
	private int senha = 2222; // senha do sistema interno
	
	// checar a Autenticacao do Gerente:
	public void checarAutenticacao(Gerente gerente) {
		
		/* Chama o autentica do Gerente passando a senha do sistema como parametro
		 * la sera comparado se a senha do sistema for igual ao senha do Gerete retorna true
		 * se nao for igual, retorna false*/
		boolean autenticou = gerente.autentica(this.senha);

		if (autenticou) {
			System.out.println("Pode entrar no Sistema");
		} else {
			System.out.println("Não pode entrar no Sistema");
		}
	}
	
	//checar a Autenticacao do Administrador:
	public void checarAutenticacao(Administrador administrador) {
		boolean autenticou = administrador.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no Sistema");
		} else {
			System.out.println("Não pode entrar no Sistema");
		}
	}
	
	/* Perceba que estamos REPETINDO CODIGO, "checarAutenticacao" do
	 * Gerente e do Administrador Tem a mesma implementação.
	 * Alem de que o metodo "autentica" que tem no Gerente e no Administrador tambem tem a
	 * mesma implementação (ESTAMOS REPETINDO CODIGO NOVAMENTE).
	 * 
	 * Será que posso Colocar o metodo "autentica" que tem em Gerente e Administrador
	 * em Funcionario, E assim usar o polimorfismo no metodo "checarAutenticacao" passando
	 * um Funcionario como parametro, assim so precisaria de um "checarAutenticacao" ao inves
	 * de fazer varios "checarAutenticacao" para tipos diferente como Gerente e Administrador
	 * 
	 * Vai ter um problema nisso, proxima aula explico.
	 * */
}
