
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	// A utilização de métodos abstratos deve ser reservada para situações em que as 
	// classes filhas precisam fornecer implementações específicas para o método
	// como a implementacao desse metodo nas classes filhas sao iguais,
	// torna-lo um metodo abstrato nao é bom nesse caso.
	@Override
	public void deposita(double valorADepositar) {
		super.setSaldo(super.getSaldo() + valorADepositar);
	}
}
