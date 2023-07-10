/* Foi criado um tipo de Funcionario novo: um Designer,
 * porem nao foi preciso alterar nada nessa classe. (A explicação esta na classe Designer)*/

public class ControleBonificacao {
	
	private double somaDasBonificacoes;
	
	public void somarBonificacao(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao(); 
		this.somaDasBonificacoes += bonificacao;
	}
	
	public double getSomaDasBonificacoes() {
		return somaDasBonificacoes;
	}
}
