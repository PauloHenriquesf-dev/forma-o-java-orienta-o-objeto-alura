
public class Testa07For {
	
	public static void main(String[] args) {
		
		
		/*For pode receber 3 valores separados por ;
		 * o 1° é opcional: é a declaraçao/inicializaçao de algo que sera o contador
		 * o 2° funciona pra ver se acondição booleana deve ou nao entrar dentro do laço
		 * o 3° costuma colocar o que sera executado no final de cada iteração*/
		
		for(int cont = 0; cont <= 10; cont++) {
			System.out.println(cont);
		}
		// OBS: a variavel cont como foi declarada dentro do for so estara "viva" dentro do laço
		// caso queira utiliza-la fora do for, deve ser declarada fora dele.
	}
}
