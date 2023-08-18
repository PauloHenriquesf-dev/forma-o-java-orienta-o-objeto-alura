
public class Gerente extends Autenticavel {

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}
}
