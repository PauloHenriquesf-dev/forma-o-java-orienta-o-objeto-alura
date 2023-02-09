
public class Testa08LacosAninhados {
	
	public static void main(String[] args) {
		
		System.out.println("Bem Vindo a Tabuada de Multiplicação");
		
		for (int num = 0; num <= 10; num++) {
			System.out.println("--Tabuada de " + num + "--");
			for (int multiplicador = 0; multiplicador <= 10; multiplicador ++) {
				
				System.out.println(num + " * " + multiplicador + " = " + (num * multiplicador));
			}
			System.out.println();
		}
	}
}
