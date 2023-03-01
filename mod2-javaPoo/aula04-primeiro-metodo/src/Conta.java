
public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void saca(double valorASacar) {
		
	}
	
	public void deposita(double valorADepositar) {
		this.saldo += valorADepositar; //somando o valor de saldo com valorADepositar e salvando em saldo
		
		/*o this no java é uma referencia, ele aponta para um objeto, "ele diz é esse objeto"
		 * pois podemos ter criado varios objetos: contaA = new Conta(), contaB = new Conta()...
		 **/
		
		/*imprimindo na tela o valor do this, sera possivel ver que ele tem o mesmo valor da referencia
		 * utilizada para invocar o metodo. Ou seja o this aponta para o mesmo objeto.
		 * EXEMPLO: contaA aponta para obejto que esta no endereço de memoria @ea30797,
		 * logo this apontara para o mesmo endereço: @ea30797*/
		
		System.out.println("valor do this: " + this);
	}
	
	public void transfere(double valorATransferir, Conta contaDestino) {
		
	}
	
}
