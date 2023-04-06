
public class TestaGettersESetters {
	
	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		
		//atribuindo valor a saldo:
		//OBS: setSaldo foi criado para poder acessar o atributo saldo, ja que esse atributo esta privado
		contaA.setSaldo(100);
		
		//verificando o valor de saldo:
		System.out.println(contaA.getSaldo());
		
		//OBS: lembrando que o atributo saldo é privado logo outras classe q nao seja a classe Conta
		//nao conseguem acessar e atribuir valores a ele. Estamos fazendo isso por metodos get e set.
	}
}
