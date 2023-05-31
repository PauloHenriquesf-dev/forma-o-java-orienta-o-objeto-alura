
public class Teste {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(11, 1111);
		Conta conta2 = new Conta(22, 2222);
		Conta conta3 = new Conta(33, 3333);
		
		//como o atributo totalDeConta é static e privado
		//estamos usando um metodo static para acessa-lo
		
		//nada imepede que eu invoque esse metodo que é static atraves do objeto: 
		System.out.println(conta1.getTotalDeContas());
		
		//porem a forma correta é invocar o metodo static atraves da propria Classe:
		System.out.println(Conta.getTotalDeContas());
		
	}
}
