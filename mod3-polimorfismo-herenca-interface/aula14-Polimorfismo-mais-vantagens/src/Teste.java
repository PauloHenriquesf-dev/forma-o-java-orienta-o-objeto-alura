
public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Gerente gerente1 = new Gerente();
		EditorDeVideo editor1 = new EditorDeVideo();
		
		//o novo tipo que foi criado:
		Designer designer1 = new Designer();
		
		//atribuindo um salario a todos os tipos:
		funcionario1.setSalario(3000);
		gerente1.setSalario(5000);
		editor1.setSalario(2000);
		designer1.setSalario(2000);
		
		//criando o objeto responsavel por fazer o Controle das Bonificacoes
		ControleBonificacao controle = new ControleBonificacao();
		
		// chamando o metodo "somarBonificacao" passando como argumento p/ parametro
		// todos os tipo pra somar as bonificações de cada tipo.
		// Lembrando que o paramentro do metodo "somarBonificacao" recebe um tipo Funcionario
		
		controle.somarBonificacao(funcionario1); //guarda o valor da sua bonificacao
		controle.somarBonificacao(gerente1); //sua bonificacao + a do funcionario1
		controle.somarBonificacao(editor1); //sua bonificacao + a do funcionario1 + gerente1
		
		//passando como parametro o novo tipo
		controle.somarBonificacao(designer1); // sua bonificacao + todas outras bonificacoes
		
		/* Perceba que criamos a classe Designer que extends de Funcionario, como ela é
		 * um funcionario n foi preciso alterar o metodo "somarBonificacao" ja que o mesmo
		 * recebe um parametro do tipo Funcionario (Mais Gernerico).
		 * Logo pode criar varios tipos mais especificos,
		 * se eles extends Funcionario n precisa alterar o metodo.
		 * Uma vantagem do polimorfismo. */
		
		//olhando o total das bonificacoes:
		System.out.println(controle.getSomaDasBonificacoes());
	}
}
