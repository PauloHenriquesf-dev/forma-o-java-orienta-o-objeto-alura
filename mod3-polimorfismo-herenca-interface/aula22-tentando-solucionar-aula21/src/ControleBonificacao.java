
public class ControleBonificacao {
	
	private double somaDasBonificacoes;
	
	public void somarBonificacoes(Funcionario funcionario) {
		this.somaDasBonificacoes += funcionario.getBonificacao();
	}
	
	public double getSomaDasBonificacoes() {
		return somaDasBonificacoes;
	}
	
}
