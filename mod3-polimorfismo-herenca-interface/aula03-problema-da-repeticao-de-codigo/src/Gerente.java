/* Temos uma classe especifica para Gerente q tem NOME, CPF, SALARIO e SENHA
 * o metodo BONIFICAÇÂO do gerente retorna 5% do valordo seu salario
 * e tem um metodo especifico de AUTENTICA a senha*/

public class Gerente {
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	
	/* Podemos ver que agora Gerente tem seu proprio getBonificacao que devolsve 5% do seu salario
	 * e o atributo senha e o metodo autentica é apenas  do Gerente e nao mais do Funcionario
	 * porem tem muita REPETICAO DE CODIGO. atributos NOME, CPF e SALARIO alem dos METODOS GETTER E SETTERS
	 * ja estao na classe FUNCIONARIO. Podemos usar a HERANÇA para herdar esses atributos e metodos em comum
	 * (AULA 04 sera feito isso)*/
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
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
