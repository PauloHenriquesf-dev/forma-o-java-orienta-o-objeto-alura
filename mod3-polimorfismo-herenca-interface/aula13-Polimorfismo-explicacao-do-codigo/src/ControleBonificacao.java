
public class ControleBonificacao {
	
	private double somaDasBonificacoes;
	
	/* usando o polimorfismo p/ lidar com diferentes tipos de funcionários
	 * de forma mais genérica.
	 * Isso permite chamar o mesmo método somarBonificacao para diferentes subtipos
	 * de Funcionario (Gerente, EditorDeVideo, ...),
	 * sem a necessidade de ter métodos separados para cada tipo específico.*/
	
	public void somarBonificacao(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao(); //sera chamado o metodo especifico
														   //do objeto passado p/ parametro 
		this.somaDasBonificacoes += bonificacao;
	}
	
	public double getSomaDasBonificacoes() {
		return somaDasBonificacoes;
	}
}
