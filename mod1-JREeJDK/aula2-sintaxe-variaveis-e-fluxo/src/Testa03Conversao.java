
public class Testa03Conversao {
	
	public static void main(String[] args) {
		
		//temos uma variavel do tipo double
		double salario = 2000.50;
		
		//queremos guardar salario em um tipo inteiro, porem dara erro.
		//int valor = salario;
		
		//para da certo deve fazer um cast (Transformar um tipo de variável para outro)
		int valor = (int) salario;
		
		System.out.println(valor); //obs: so vai mostrar a parte inteira (perdendo o .50 do salario)
	}
}
