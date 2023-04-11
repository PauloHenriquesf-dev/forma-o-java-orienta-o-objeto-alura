
public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		//atribuir numero da conta de forma direta: conta.numero = 1111; // N é possivel, numero é privado
		
		//é preciso usar os metodos getters(acessar/pegar), setters(atribuir):
		conta.setNumero(1111);
		
		System.out.println(conta.getNumero());
	
		
	}
}
