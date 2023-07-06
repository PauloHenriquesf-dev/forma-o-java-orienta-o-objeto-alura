
public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Gerente gerente1 = new Gerente();
		EditorDeVideo editor1 = new EditorDeVideo();
		
		funcionario1.setSalario(3000);
		gerente1.setSalario(5000);
		editor1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		//passando as bonificoes p/ o metodo da classe ControleBonificacao fazer o controle
		
		/* Antes a classe ControleBonificacao tinha varios metodos "somarBonificacao"
		 * com parametros para cada tipo: Gerente, Editor, Funcionario...
		 * Agora atrave do POLIMORFISMO deixamos apenas um "somarBonificacao"
		 * recebendo um Funcionario, ja que Gerente e editor tambem é um funcionario
		 * podemos passar eles como argumento p/ parametro q recebe o tipo Funcionario*/
		
		controle.somarBonificacao(funcionario1);
		controle.somarBonificacao(gerente1);
		controle.somarBonificacao(editor1);
		
		//imprimir o a soma das boificacoes de todos
		System.out.println(controle.getSomaDasBonificacoes()); // imprime 1350.0
		
		/* IMPORTANTE:
		 * Na classe ControleBonificacao temos o metodo "somarBonificacao:"
		 * 
		 * 	public void somarBonificacao(Funcionario funcionario) {
		 *		double bonificacao = funcionario.getBonificacao();
		 * 		this.somaDasBonificacoes += bonificacao;
		 *	}
		 *	
		 * Podemos passar p/ o parametro um Gerente, EditorDeVideo e Funcionario,
		 * porem no trecho de codigo: "funcionario.getBonificacao()"
		 * qual metodo "getBonificacao()" sera chamado, ja que Gerente, Editor e Funcionario
		 * cada um tem o seu proprio metodo "getBonificacao". 
		 * 
		 * CONFIRA os getBonificacao de cada Tipo:
		 * Funcionario:   return this.salario * 0.1;
		 * Gerente:       return super.getBonificacao() + (super.getSalario() * 0.05);
		 * EditorDeVideo: return super.getBonificacao() + 100;
		 * 
		 * Se passar um Gerente p/ metodo "somarBonificacao(Funcionario funcionario)"
		 * qual "getBonificacao()" sera invocado, onde tem "funcionario.getBonificacao()" ?
		 * 
		 * Sera o "getBonificacao" do Funcionario? ja que o "somarBonificacao" recebe o tipo
		 * Funcionario?
		 * 
		 * NÃO! Lembre que um Gerente tambem é um Funcionario, entao pode passar o Gerente e
		 * em "funcionario.getBonificacao()" sera invocado o "getBonificacao" especifico do
		 * Gerente.
		 * Assim conmo se passar um EditorDeVideo sera invocado seu "getBonificacao" etc.
		 * 
		 * */
	}
}
