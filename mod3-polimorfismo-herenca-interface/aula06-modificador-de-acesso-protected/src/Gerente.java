
public class Gerente extends Funcionario {

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
	/*
	 * Na aula-4 tinha um problema no metodo getBonificacao() do Gerente:
	 * ele retorna 5% do salario, porem salario é um atributo declarado na classe Funcionario
	 * Mesmo Gerente tendo salario por herdar de Funcionario, esse atributo n foi declarado em Gerente
	 * Entao se esse atributo estiver PRIVATE em Funcionario, Gerente nao vai conseguir ve-lo.
	 */
	
	/* OBS: atributos PROTECTED podem ser visto por outras classes (NAO FILHAS) estando no MESMO pacote
	 * AGORA se essas classes (NAO FILHAS) estiver em pacotes diferentes NAO vao conseguir enxergar.
	 * Ja classes FILHAS conseguem ver atributos PROTECTED mesmo em pacotes diferentes.
	 * é bastante importante criar diferentes pacotes de acordo com as necessidades do programa.
	 */
	
	// O que pode ser feito para resolver esse problema é declarar o atributo salario em Funcionario
	// como Protected: dessa forma todas as CLASSES FILHAS (classes que EXTENDS de Funcionario) poderao
	// enxergar o atributo salario
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}

}
