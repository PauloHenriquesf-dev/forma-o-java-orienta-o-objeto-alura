
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setSalario(5000);
		
		// Pela nova regra de negocio Gerente deve receber 10% do seu salario
		//   +  5% do seu salario.
		
		System.out.println(gerente1.getBonificacao()); // imprime 750.0
		
		// 10% de 5000 = 500
		//  5% de 5000 = 250
		// 500 + 250 = 750 , Logo esta funcionando.
		
		/* Porem temos um problema: da pra melhorar nosso codigo, deixa-lo mais otimizado
		 * e evitar a repeticao de codigo no nosso metodo getBonificacao() que foi reescrito
		 * em Gerente.
		 * Isso sera feito na proxima aula.
		 */ 
	}
}
