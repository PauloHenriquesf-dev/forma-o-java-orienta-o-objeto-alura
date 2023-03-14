
public class Testa {
	
	public static void main(String[] args) {
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(300);
		
		Conta contaHenrique = new Conta();
		contaHenrique.deposita(300);
		
		System.out.println("Saldo da Conta do Paulo: " + contaPaulo.saldo); //300
		System.out.println("Saldo da Conta do Henrique: " + contaHenrique.saldo); //300
		
		//transferindo 150 da conta do Paulo para a conta do henrique:
		contaPaulo.transfere(150, contaHenrique);
		
		System.out.println("Saldo da Conta do Paulo: " + contaPaulo.saldo); //150
		System.out.println("Saldo da Conta do Henrique: " + contaHenrique.saldo); //450

	}
}
