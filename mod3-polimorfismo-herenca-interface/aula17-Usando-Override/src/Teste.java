
public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(11, 1111);
		
		cc.deposita(100);
		
		System.out.println("Saldo: " + cc.getSaldo()); // imprime 100
		
		cc.sacar(10);
		
		System.out.println("Saldo: " + cc.getSaldo()); // imprime 89.80
		
	}
	
}
