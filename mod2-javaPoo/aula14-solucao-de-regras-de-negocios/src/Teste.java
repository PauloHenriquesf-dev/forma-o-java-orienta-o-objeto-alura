
public class Teste {
	
	public static void main(String[] args) {
		/* Estado consistente do Objeto é quando esta tudo ok "de acordo com o q foi passado pelo chefe,
		 * ou seja de acordo com as regras de negocios".
		 * vamos ver se todos os valores fazem sentido.
		 * */
		
		//1° regra de negocio: NAO PODE VALOR NEGATIVO para AGENCIA e NUMERO
		//quando crio uma conta isso é possivel?
		//Sim podemos, passando no setAgencia ou setNumero valores negativos, isso n deveria ser possivel
		Conta conta = new Conta();
		conta.setAgencia(-50);
		conta.setNumero(-111);
		
		//-> Deve alterar os metodos setAgencia e setNumero colocando if's para nao aceitar valor negativo
		
		
		//2° regra: Toda conta que for criada ja deve ser passado o valor da Agencia e Numero:
		//quando crio uma conta isso é possivel?
		//por enquanto Não, devemos criar um construtor que seja capaz de receber 2 parametros.
		Conta novaConta = new Conta();
		System.out.println("Agencia: " + novaConta.getAgencia()); //imprime 0
		System.out.println("Numero: " + novaConta.getNumero());   //imprime 0
		// perceba que nossos construtor: "Conta()" nao recebe parametros, logo os atributos desse objeto
		// serao iniciados com valor padrao de acordo com seu tipo, Agencia e numero é int entao serao ZERO
		
		
		//-> Pode ser criado um CONSTRUTOR que receba como parametro 2 valores (Agencia e Numero).
		//   E caso seja util dentro desse construtor pode criar if's para aceitar somente Agencia e Numero
		//   maior que zero.
	}
}
