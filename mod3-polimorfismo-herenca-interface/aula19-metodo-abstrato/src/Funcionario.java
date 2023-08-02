
// Não pode instanciar essa classe, porque é abstrata
// OBS: continua tendo os beneficios da Herança e do Polimorfismo
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	/* Nova Regra: cada funcionario tem seu tipo de bonificacao,
	 * Nao se tem mais aquela Bonificacao padrao que tinha na classe Funcionario,
	 * que seria 10% do seu salario.
	 * Logo nao precisa ter um calculo no getBonificacao em Funcionario como tinha antes,
	 * ja que cada Funcionario: Gerente, EditoDeVideo e Designer tera sua propria Bonificacao
	 * sem precisar mais do calculo base da Bonificacao dos 10% do salario que tinha no
	 * get Bonificacao na classe Funcionario.
	 * 
	 * Como o getBonificacao em Funcionario nao possue corpo, e queremos obrigar os filhos:
	 * Gerente, EdigtorDeVideo e Designer implemente seu Proprio getBonificacao, basta
	 * colocar o metodo getBonificacao em Funcionario como abstract. 
	 */
	public abstract double getBonificacao();
	
	// Metodos abstratos nao possuem implementacao, Apenas definem a assinatura:
	// (visibilidade, retorno, nomeDoMEtodo e parametros).
	// as classes filhas devem implementar OBRIGATORIAMENTE.
	// OBS: se a classe filha tambem for uma classe abstrata ela nao é obrigada a implementar
	// os metodos abstratos da classe mae.
	
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
