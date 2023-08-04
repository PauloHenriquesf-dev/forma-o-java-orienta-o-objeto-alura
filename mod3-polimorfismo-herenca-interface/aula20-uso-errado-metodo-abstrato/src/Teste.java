
public class Teste {
	
	public static void main(String[] args) {
		
		// nao pode instaciar a classe Conta, pois é abstrata:
		
		// Conta conta = new Conta(11, 1111); //Da erro
		
		ContaCorrente cc = new ContaCorrente(11, 1111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(22, 2222);
		cp.deposita(200.0);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupanca: " + cp.getSaldo());
		
		cc.transfere(10, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupanca: " + cp.getSaldo());
	}
}
