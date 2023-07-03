
public class EditorDeVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;
		// sua bonificacao é a bonificacao padrao de um funcionario (10% do salario)
		// + 100 reais.
	}
	
}
