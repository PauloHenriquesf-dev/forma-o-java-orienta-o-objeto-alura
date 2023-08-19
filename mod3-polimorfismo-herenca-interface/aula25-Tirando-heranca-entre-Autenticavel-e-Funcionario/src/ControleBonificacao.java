
public class ControleBonificacao {
	
	private double somaDasBonificacoes;
	
	public double getBonificacaoTotal() {
		return somaDasBonificacoes;
	}
	
	public void somarBonificacao(Funcionario funcionario) {
		this.somaDasBonificacoes += funcionario.getBonificacao();
	}
	
}
