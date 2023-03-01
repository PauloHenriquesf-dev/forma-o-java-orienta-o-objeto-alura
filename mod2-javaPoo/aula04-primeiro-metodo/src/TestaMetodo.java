
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaA = new Conta();
		
		/* nao é legal atribuir de forma direta um valor pra um atributo do objeto.
		 * EXEMPLO: contaA.saldo = 300.
		 * o certo é fazer isso atraves de metodos
		 * EXEMPLO: contaA.deposita(300).
		 * onde o metodo deposita tem uma logica dentro dele que recebe um valor e joga no atributo saldo 
		 * */
		
		//invocando o metodo deposita:
		contaA.deposita(300);
		
		System.out.println(contaA.saldo);
		
		//lembrando que nossa variavel contaA é uma referência, ela aponta para o objeto criado com o new
		System.out.println("Valor de contaA: " + contaA);
		
		//this é uma referencia que aponta pro objeto referenciado
		//no nosso caso chamamos o metodo deposita atraves do contaA que referencia um objeto
		//logo o this do metodo deposita referenciara o mesmo objeto.
		
		//Caso chamasse o metodo deposita com outra referencia: contaB o this do metodo deposita
		//teria a mesma referencia do contaB e nao do contaA
		// o this fala isso "é esse objeto".
		
	}
}
