
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		
		//depositando 100 reais:
		contaA.deposita(100);
		
		//tentando sacar um valor maior que 100 reais:
		contaA.saca(101);
		
		// nao foi possivel sacar 101 reais, nosso metodo saca tem um "if" que verifica se o valor
		// a sacar é maior que o saldo disponivel, logo ele ver que 101 é maior do que 100 e nao retira.
		System.out.println("Saldo: " + contaA.saldo); // imprime 100
		
		//com os metodos criados n tem como deixar saldo negativo, mas se atribuir um valor direto no saldo?
		contaA.saldo = -100;
		
		System.out.println("Saldo: " + contaA.saldo); // vai imprimir -100
		
		//OBS: não devemos acessar um atributo de forma direta, e sim acessa-los por metodos
		
		/*nao queremos acessar atributos de forma direta, apenas por metodos.
		 *Para que os atributos n sejam acessado nem atribuidos de forma direta é so encapsula-lo
		 *podemos fazer isso usando uma palavra reservada "privado" antes do tipo do atributo.
		 *
		 *foi o que fizemos para o atributo saldoPrivado, ficou: private double saldoPrivado;
		 */
		
		//nao conseguimos acessar o atributo privado nessa classe de forma direta:
		//contaA.saldoPrivado = 100; // da erro, pois atributo é privado
		
		//agora saldoPrivado so pode ser acessado pelo metodo
		contaA.depositaPrivado(100);
		
		//para imprimir/ler o saldoPrivado devemos criar um metodo que pega o saldoPrivado e informa seu valor:
		System.out.println("Saldo privado: " + contaA.pegaSaldoPrivado());
	}
}
