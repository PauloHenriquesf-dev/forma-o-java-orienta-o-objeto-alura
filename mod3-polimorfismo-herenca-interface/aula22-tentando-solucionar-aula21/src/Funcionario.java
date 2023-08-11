
public abstract class Funcionario {
	
	/* Parte do codigo onde estava contido em Gerente e Administrador,
	 * responsavel por suas autenticações:
	 * 
	 * Trouxemos essa parte do codigo, pois o mesmo estava duplicado,
	 * em Gerente e Administrador, Agora tem em Funcionario e Gerente e Administrador por
	 * serem funcionario terão essa parte da autenticacao.
	 * 
	 * Será que isso resolve o problema?
	 * - Não, pois agora EditorDeVideo e Designer tambem vão ter essa autenticacao
	 * e pela nossa regra de negocio eles nao devem ter.
	 * */
	
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
	/* Parte do codigo onde estava contido em Gerente e Administrador,
	*   responsavel por suas autenticações */
	
	
	
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
