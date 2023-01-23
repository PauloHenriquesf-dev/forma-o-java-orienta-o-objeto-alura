
public class Testa04Caracteres {
	
	public static void main(String[] args) {
		
		//char guarda uma unica letra
		char letra = 'a';
		System.out.println(letra);
		
		//as letras são valores (pesquisar sobre tabela unicode, Código ASCII)
		char valor = 66;
		System.out.println(valor); //imprime a letra B
		
		//cuidado: ao fazer a variavel valor + 1, vai ser 67 que é uma letra
		//porem um int é maior que um char e valor é do tipo char, precisa do cast
		valor = (char) (valor + 1);
		System.out.println(valor); // imprime letra C
		
		//usando String
		String palavra = "curso de java";
		System.out.println(palavra);
		
		//concatenando Strings
		palavra += 2023;
		System.out.println(palavra); //imprime: curso java2023
	}
}
