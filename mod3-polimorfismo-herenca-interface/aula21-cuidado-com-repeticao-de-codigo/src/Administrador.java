
public class Administrador extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return 1200;
	}
	
	//------- Parte do Codigo responsavel pela Autenticacao do Administrador ---------//
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	//------- Parte do Codigo responsavel pela Autenticacao do Administrador -----------//
	
}
