
public class Testa09lacosAninhados {
	
	public static void main(String[] args) {
		
		/*For aninhado funciona da seguinte forma:
		 * o primeiro laço representa linhas (horizontal)
		 * o segundo laço representa colunas (vertical)*/
		
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 0; coluna < linha; coluna++) {
				
				System.out.print("* ");
				
			}// ao chegar aqui coluna é incrementado +1
			System.out.println();
		} //ao chegar aqui linha é incrementado +1
		
		
		//Extra: usando o break no laço vai causar uma interrupção imediata do mesmo,
		//continuando a execução do programa na próxima linha após o laço.
		System.out.println("---------------------------");
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 10; coluna >= 0; coluna--) {
				
				if (coluna == linha) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
}
