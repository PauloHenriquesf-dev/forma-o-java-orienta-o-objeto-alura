
public class Funcionario {

	//o que um funcionario tem (Seus atributo)
	private String nome;
	private String cpf;
	private double salario;
	
	/*regra de negocio é q funcionario deve receber alem do seu salario uma bonificacao
	* bonificação essa que vale 10% do seu salario.
	* 
	* perceba que o nome do metodo comeca com get apesar de n ter um atributo chamado bonificacao,
	* isso pq podemos criar nossos proprios getters */
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
