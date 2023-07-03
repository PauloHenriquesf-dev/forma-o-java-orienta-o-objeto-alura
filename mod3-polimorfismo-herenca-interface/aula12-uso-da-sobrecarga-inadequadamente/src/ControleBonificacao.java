/* Classe responsavel ter um controle de quanto gastara com bonificacoes, 
 * ela faz um somatorio das bonificacoes dos Gerentes, Funcionarios, E EditorDeVideo */

public class ControleBonificacao {
	
	private double somaDasBonificacoes;
	
	//Grente Deve informar o valor da sua bonificacao
	public void somarBonificacao(Gerente gerente) {
		double bonificacao = gerente.getBonificacao();
		this.somaDasBonificacoes += bonificacao;
	}
	
	// Funcionario deve informar o valor da sua bonificacao
	public void somarBonificacao(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.somaDasBonificacoes += bonificacao;
	}
	
	// EditorDeVideo deve informar o valor da sua bonificacao 
	public void somarBonificacao(EditorDeVideo editor) {
		double bonificacao = editor.getBonificacao();
		this.somaDasBonificacoes += bonificacao;
	}
	
	/* Perceba que acima temos 3 metodos que fazem a mesma coisa,
	 * Eles possuem apenas parametros de tipos diferentes (isso é Sobrecarga)
	 * pode usar o polimorfismo p/ tratar objetos Gerente e EditorDeVideo como Funcionario,
	 * Ou seja ter apenas um metodo somarBonificacao recebendo um Funcionario,
	 * Ja que Gerente e EditorDeVideo extends Funcionario (sao Funcionario) pode passa-los
	 * como argumento ao invocar o metodo.
	 * evitando a necessidade de ter várias versões do mesmo método.
	 * 
	 * A sobrecarga de método é útil quando você tem comportamentos distintos
	 * para diferentes tipos de parâmetros.
	 * 
	 * No entanto, aqui o único objetivo é somar a bonificação,
	 * então utilizar o polimorfismo é mais adequado. 
	 * */
	
	public double getSomaDasBonificacoes() {
		return somaDasBonificacoes;
	}
}
