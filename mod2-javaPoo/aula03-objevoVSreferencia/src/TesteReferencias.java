
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		
		//atribuindo 300 no saldo do objeto referenciado pela variavel contaA
		contaA.saldo = 300;
		
		System.out.println(contaA.saldo); // imprime 300
		
		//OBS: contaA nao é um objeto Conta, ela é uma referencia.
		
		//Quando é dado new vc esta pedindo para reservar um espaço de memoria para aquele objeto ser
		//guardado. E a variavel contaA aponta onde aquele objeto esta guardado (referencia aquele obj). 
		
		
		//vamos fazer uma outra variavel receber o valor de contaA: o valor de contaA é a referencia
		//do objeto que ja foi criado. Logo contaB vai pontar para o mesmo objeto que contaA aponta.
		Conta contaB = contaA;
		
		System.out.println(contaB.saldo); //vai imprimir 300 tambem, ja que aponta pro mesmo obj q contaA
		
		//cada objeto tem um endereço de mororia:
		System.out.println(contaA); // imprime algo do tipo: Conta@41975e01
		System.out.println(contaB); // imprime algo do tipo: Conta@41975e01
		
		//acima podemos ver que é impresso o mesmo endereço de memoria, as variaveis possuem
		//a mesma referencia, ou seja apontam para o mesmo objeto.
		
		//podemos comparar as duas contas (O == COMPARA REFERENCIAS)
		if (contaA == contaB) {
			System.out.println("Mesma Conta");
		} else {
			System.out.println("Contas Diferente");
		}
		//a condicao acima imprime que é mesma contas (possuem a mesma referencia)
		
		/*Conclusão: Objetos nunca são manipulados diretamente, mas sempre através de uma variável
		 * que contém uma referência para o objeto.
		 * Internamente, uma referência conterá o endereço p/ área de memória que contém o objeto.*/
	}
}
