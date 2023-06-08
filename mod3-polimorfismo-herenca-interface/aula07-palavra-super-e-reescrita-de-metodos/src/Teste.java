
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		gerente1.setSalario(5000);
		
		Funcionario func1 = new Funcionario();
		func1.setSalario(3000);
		
		
		System.out.println(gerente1.getBonificacao()); //250.0 (imprime 5% do slario)
		System.out.println(func1.getBonificacao());    //300.0 (imprime 10% do salario)
		
		/* getBonificacao é um metodo declarado na classe Funcionario que retorna 10% do salario
		 * e Gerente herda esse metodo, o getBonificacao de gerente tem a mesma assinatura do
		 * getBonificacao() do Funcionario. Nos apenas Reescrevemos esse metodo alterando seu
		 * comportamento, Ao inves dele retornar 10% do salario, Retornara 5% do salario.
		 * 
		 * Logo o getBonificacao de Funcionario e Gerente terao comportamentos diferentes.
		 * Isso é Possivel atraves da REESCRITA OU SOBRESCRITA (sao sinonimos)*/
		
		
	}
}
