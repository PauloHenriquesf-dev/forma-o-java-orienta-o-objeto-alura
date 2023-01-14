
public class Testa02PontoFlutuante {
	
	public static void main(String[] args) {
		
		//declarando variavel do tipo double:
		double salario;
		
		//atribuindo valor:
		salario = 2000.50;
		
		//imprimindo:
		System.out.println("Meu sálario é: R$ " + salario);
		
		//OBS1: tipo inteiro cabe no double:
		double idadeTipoDouble = 29; // 37 é um numero inteiro
		
		System.out.println("Idade: " + idadeTipoDouble);
		
		//OBS2: tipo double nao cabe no int:
		//int idadeTipoInt = 29.0; ->>> DA ERRO <<<-
		
		double divisao = 2.14 / 2;
		System.out.println(divisao);
		
		//OBS3: cuidado ao guardar valor da divisão em tipos "inteiros"
		int divisao2 = 5 / 2;
		System.out.println(divisao2); // (vai imprimir 2 e não 2.5)
		
		//OBS4:
		double divisao3 = 5 / 2;
		System.out.println(divisao3);
		//ISSO OCORRE PQ O JAVA FAZ DA DIREITA P/ A ESQUERDA, OU SEJA ELE VIU QUE 2 E 5 SAO INTEIRO
		//LOGO ELE PENSA QUE O RESULTADO VAI SER INTEIRO, POR ISSO ELE PEGA APENAS O RESULTADO 2 AO 
		//INVEZ DE 2.5. SO DEPOIS VER QUE O TIPO É DOUBLE AI ELE JA NAO VOLTA MAIS, POR ISSO FICA 2.0
		//SE UM DOS 2 NUMERO FOSSE DOUBLE DARIA CERTO, EXEMPLO: 5.0 / 2;
		
	}
}
