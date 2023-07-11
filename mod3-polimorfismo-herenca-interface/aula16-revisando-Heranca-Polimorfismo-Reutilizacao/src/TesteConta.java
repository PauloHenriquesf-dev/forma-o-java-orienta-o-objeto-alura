
public class TesteConta {
	
	public static void main(String[] args) {
		
		/* Os metodos como deposita, etc e atributos como saldo, etc
		 * sao herdados da classe Conta atarves do "extends" */
		
		ContaCorrente cc = new ContaCorrente(11, 1111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(22, 2222);
		cp.deposita(200.0);
		
		// transferindo 10 reais da contaCorrente pra contaPoupanca
		cc.transfere(10, cp);
		
		System.out.println("Saldo CC: " + cc.getSaldo()); //imprime 90.0
		System.out.println("Saldo CP: " + cp.getSaldo()); //imprime 210.0
		
		/* O que podemos perceber é a REUTILIZAÇÃO. ContaCorrente e ContaPoupanca tem apenas
		 * um construtor implementado nelas.
		 * Porem como els "extends" de Conta, elas vao ter metodos e atributos da Conta */
	}
	
}
