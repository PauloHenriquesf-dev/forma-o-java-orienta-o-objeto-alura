
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(200);
		
		Conta contaHenrique = new Conta();
		contaHenrique.deposita(200);
		
		System.out.println("Saldo conta Paulo: " + contaPaulo.saldo); // 200
		System.out.println("Saldo conta Henrique: " + contaHenrique.saldo); // 200
		
		//fazendo a conta do Paulo Transferir 100 para conta do Henrique:
		//Ao invocar o metodo transfere passamos um valor e uma referencia do tipo Conta
		//essa referencia do tipo conta (ContaHenrique) é o endereço de memoria de onde
		//esta o objeto criado com o new 
		contaPaulo.transfere(100, contaHenrique);
		
		System.out.println("Saldo conta Paulo: " + contaPaulo.saldo); // 100
		System.out.println("Saldo conta Henrique: " + contaHenrique.saldo); // 300
		
		//Perceba que a conta do Paulo que é a responsavel por transferir o dinheiro nao foi preciso
		//passa-la como parametro.
		//Pois ela ja é a referencia do metodo que esta sendo invocado (this)
		
		//COMO O METODO TRANSFERE RETORNA UM BOOLEANO PODEMOS GUARDAR ESSE RETORNO E FAZER UMA CHECAGEM,
		//OU PODEMOS FAZER A CHECAGEM SEM GUARDAR O RETORNO< APENAS CONFERINDO-O DE FORMA DIRETA:
		if (contaPaulo.transfere(50, contaHenrique)) {
			System.out.println("Trasferencia deu certo!");
		} else {
			System.out.println("Transferencia nao deu certo!");
		}
		//OBS: contaPaulo.transfere(50, contaHenrique) que ta dentro do if, ele retorna true ou false 
	}
}
