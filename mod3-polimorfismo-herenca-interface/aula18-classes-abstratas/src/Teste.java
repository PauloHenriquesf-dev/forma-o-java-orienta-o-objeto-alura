
public class Teste {
	
	public static void main(String[] args) {
		
		// classes abstratas nao podem ser instanciadas
		
		//Funcionario funcionario = new Funcionario(); Isso nao pode
		
		Funcionario gerente = new Gerente(); // isso pode
		
		/* Perceba que o lado esquerdo tem o tipo Funcionario: "Funcionario gerente"
		 * Isso pode pois é o tipo da nossa variavel, e como Gerente Herda de Funcionario,
		 * Gerente tambem é um Funcionario.
		 * 
		 * Do lado direito: "new Gerente()" tambem pode, pois gerente é algo concreto
		 * e podemos criar objetos que sao concretos, so nao pode criar objetos abstratos.
		 * Ou seja do lado esquero pode ter o tipo Funcionario
		 * porem do lado direito nao pode ter: "new Funcionario()".
		 * 
		 * */
		
		
	}
}
