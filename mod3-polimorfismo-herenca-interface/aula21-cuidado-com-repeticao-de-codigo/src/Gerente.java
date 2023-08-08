
public class Gerente extends Funcionario {

	//------- Parte do Codigo responsavel pela Autenticacao do Gerente ---------//
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
	//------- Parte do Codigo responsavel pela Autenticacao do Gerente -----------//
	
	
	@Override
	public double getBonificacao() {
		return super.getSalario(); // recebe de bonificacao o mesmo tanto do seu salario
	}

}
