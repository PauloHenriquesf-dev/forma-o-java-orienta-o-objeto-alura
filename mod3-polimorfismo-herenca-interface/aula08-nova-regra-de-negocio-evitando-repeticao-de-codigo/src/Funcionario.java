/********** SURGE UMA NOVA REGRA DE NEGOCIO ************
 * Agora Gerente vai receber:
 * a bonificação padrão de um Funcionario (10%) do salario 
 *                     + 
 * sua antiga Bonificação de Gerente que era (5%) do salario.
 ******************************************************** */

public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}

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
