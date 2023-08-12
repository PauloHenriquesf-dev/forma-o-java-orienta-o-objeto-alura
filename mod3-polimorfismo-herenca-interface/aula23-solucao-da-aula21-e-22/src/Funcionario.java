
public abstract class Funcionario {
	
	/* O codigo comentado abaixo que faz a autenticacao, vai p/ uma classe intermediaria
	 * se deixar aqui TODAS as classes filhas de Funcionario terao acesso a autenticacao
	 * sendo que apenas Administrador e Gerente podem ter acesso. 
	 * Logo faremos Gerente e Administrador herdar dessa classe intermediaria
	 * e nao diretamente de Funcionario */
	
	/*
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
	} */
	
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
