
public class Funcionario {

	private String nome;
	private String cpf;
	protected double salario;
	
	/* ASSINATURA DO METODO getBonificacao:
	 * A assinatura de um método em Java é composta pelo nome do método,
	 * pelos tipos de parâmetros que ele recebe e pelo tipo de retorno e visibilidade.
	 * É uma forma única de identificar um método dentro de uma classe.
	 * 
	 * Perceba que nosso metodo getBonificacao()
	 * é public; retorna um double; seu nome é getBonificacao; e nao recebe parametros
	 * Essa é sua assinatura.
	 * GERENTE vai ter o mesmo metodo com mesma assinatura, porem com comportamento, implementacao
	 * diferente do getBonificacao do Funcionario. isso se chama REESCRITA ou SOBRESCRITA
	 */
	
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
