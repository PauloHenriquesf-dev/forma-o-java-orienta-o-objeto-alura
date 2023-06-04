
public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setTipo(0); // tipo = 0, com isso ele sera um funcionario comum
		funcionario1.setSalario(3000);
		
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setTipo(1); // tipo = 1, com isso ele sera um Gerente
		funcionario2.setSalario(4000);
		
		
		System.out.println("Bonificação do Funcionario1: " + funcionario1.getBonificacao()); //300.00
		System.out.println("Bonificação do Funcionario2: " + funcionario2.getBonificacao()); //200.00

		
	}
}
