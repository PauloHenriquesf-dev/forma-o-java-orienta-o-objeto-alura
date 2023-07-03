/* RECAPITULANDO:
* Vimos que POLIMORFISMO é quando um objeto pode ser referenciado atraves de uma
* referencia do mesmo tipo, ou de uma referencia mais Generica. 
* Ou seja se tenho um objeto do tipo Gerente, posso ter uma referencia do tipo
* Gerente(mesmo tipo), ou uma referencia do tipo Funcionario(Mais Generico). */


/* NOVA REGRA: Nessa empresa deve ter uma classe que seja responsavel por fazer a
 * soma das bonificacoes de todos os funcionario. Ou seja:
 * tem um metodo onde cada funcionario informa sua bonificacao e é feito o somatorio. 
 */ 

public class Teste {
	
	public static void main(String[] args) {
		
		//=-=-=-=-=-= TESTE1: Referencia e Objeto do tipo GERENTE =-=-=-=-=-=-=
		
		//Criando objeto do tipo Gerente, e sua referencia tambem do tipo Gerente
		Gerente gerente1 = new Gerente();
		
		gerente1.setNome("Henrique");
		gerente1.setSalario(5000);
		
		// Criamos objeto do tipo ControleBonificacao,
		// essa classe possui 3 metodos para fazer o somatorio das bonificacoes,
		// dos Gerentes, Funcionarios e EditorDeVideo.
		ControleBonificacao controle = new ControleBonificacao();
		
		//invocando metodo que tem como parametro um GERENTE, para somar a bonificacao 
		controle.somarBonificacao(gerente1);
		
		//verificar a soma das bonificacoes (Ate agora so tem a do gerente1)
		System.out.println(controle.getSomaDasBonificacoes()); // imprime 750.0
		
		
		//=-=-=-=-=-= TESTE2: Referencia e Objeto do tipo FUNCIONARIO =-=-=-=-=-=-=
		
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setSalario(3000);
		
		//invocando metodo que TEM COMO PARAMETRO UM FUNCIONARIO, para somar a bonificacao 
		controle.somarBonificacao(funcionario2);
		
		//verificar a soma das bonificações (tem 2 bonificacoes somadas)
		System.out.println(controle.getSomaDasBonificacoes()); // imprime 1050.0
		
		
		//=-=-=-=-=-= TESTE3: Referencia e Objeto do tipo EDITORdeVIDEO =-=-=-=-=-=-=
		
		EditorDeVideo editor3 = new EditorDeVideo();
		
		editor3.setSalario(2000);
		
		//invocando metodo que TEM COMO PARAMETRO UM EDITORdeVIDEO, para somar a bonificacao 
		controle.somarBonificacao(editor3);
		
		//verificar a soma das bonificações (tem 3 bonificacoes somadas)
		System.out.println(controle.getSomaDasBonificacoes()); //imprime 1350.0
		
		
		/* Na classe ControleBonificaco, que é a classe que tem metodos para somar as 
		 * bonificacoes dos Gerentes, Funcionarios e EditorDeVideos.
		 * O problema é q temos varios metodos semelhantes, a unica diferenca seu parametro.
		 * Um metodo recebe um Gerente, outro um EditorDeVideo, etc.
		 * Mas esses metodos fazem a mesma coisa: Somam a bonificacao.
		 * 
		 * Se for criado uma nova classe (Designer) e esse Diretor Extends de Funcionario
		 * tem q criar outro metodo "somarBonificacao" recebendo um Designer como parametro?
		 * 
		 * NAO! isso pode ser resolvido usando o Polimorfismo.
		 * Vamos ter APENAS UM metodo "somarBonificacao"
		 * recebendo um Funcionario como ṕarametro:
		 * 
		 * Ex: somarBonificacao(Funcionario funcionario) { ... } 
		 * 
		 * como um Gerente, um EditorDeVideo extends de Funcionario, eles são Funcionario
		 * podemos passa-los como argumento ao invocar o metodo.
		 * 
		 * EX:
		 * controle.somarBonificacao(gerente);
		 * controle.somarBonificacao(editor);
		 * 
		 * Mesmo o metodo estando implementado assim:
		 * somarBonificacoes(Funcionario funcionario);
		 * 
		 * como Gerente e Editor é um Funcionario, vai da certo passa-los como argumento.
		 * */
	}
}
