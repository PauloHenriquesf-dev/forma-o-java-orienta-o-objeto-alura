
public class Teste {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(5000);
		
		EditorDeVideo editor = new EditorDeVideo();
		editor.setSalario(3000);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.somarBonificacoes(gerente);
		controle.somarBonificacoes(editor);
		controle.somarBonificacoes(designer);
		
		System.out.println("Total de Bonificações: " + controle.getSomaDasBonificacoes());
		
		/* Perceba que mesmo com classes e metodos abstratos tudo funciona normalmente
		 * e podemos usar A Herança e o Polimorfismo normalmente.
		 * Em Resumo:
		 * 
		 * Classes abstratas: Use quando você quer fornecer uma base comum para subclasses,
		 * mas não deseja criar objetos diretamente da classe abstrata.
		 * Elas podem conter métodos abstratos (sem implementação) e
		 * métodos concretos (com implementação).
		 * 
		 * Métodos abstratos: Use quando você quer garantir que todas as subclasses
		 * devem implementar um determinado método. As subclasses são obrigadas a fornecer
		 * uma implementação para os métodos abstratos da classe Mãe.
		 * 
		 * Essas abstrações ajudam a estruturar melhor o código,
		 * garantem a coerência entre as subclasses e permitem uma maior
		 * flexibilidade e extensibilidade do sistema.
		 * */
	}
}
