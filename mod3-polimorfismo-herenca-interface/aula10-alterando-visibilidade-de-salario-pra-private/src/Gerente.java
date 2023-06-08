
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
	
	/* Ao trocar a visibilidade do atributo salario em Funcionario de PROTECTED para PRIVATE
	 * vai ocorrer um erro em getBonificacao() do Gerente no "super.salario * 0.05"
	 * Pois como salario esta PRIVATE so pode ser visto na classe onde foi declarado (FUNCIONARIO)
	 * Logo Gerente nao vai conseguir enxergar o atributo salario.
	 * Mas podemos utilizar o metodo getSalario da classe mae atraves do super,
	 * lembrando que o metodo getSalario retorna o salario.
	 * */
	public double getBonificacao() {
		//return super.getBonificacao() + (super.salario * 0.05);
		
		// maneira correta:
		return super.getBonificacao() + (super.getSalario() * 0.05);
	}

}
