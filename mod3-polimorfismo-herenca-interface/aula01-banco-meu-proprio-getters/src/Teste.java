
public class Teste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		/* Revisando: na classe funcionario nao criamos nenhum Construtor,
		 * o compilador insere o construtor padrao. Segue modelo do construtor padrao Funcionario:
		 * 
		 * public Funcionario() {
		 * 		
		 * }
		 * 
		 * OBS: Agora se vc criar um construtor diferente do construtor padrao, o compilador n vai inserir
		 * o construtor padrao de forma automatica.
		 * Se quiser um padrao, deve cria-lo, ja que pode ter varios construtores.
		 * O construtor padrao NAO recebe nenhum parametro, por isso é dado apenas new Funcionario();
		 * sem passar nada dentro do parenteses.
		 * */
		
		funcionario1.setNome("Henrique");
		funcionario1.setCpf("111.111.111-11");
		funcionario1.setSalario(2500);
		
		//pegando nome do funcionario atraves do metodo getNome e imprimindo:
		System.out.println(funcionario1.getNome());
		
		
		//chamando nosso metodo getBonificacao para ver a bonificação do funcionaro
		//esse metodo devolve retorna 10% do salario do funcionario
		
		System.out.println(funcionario1.getBonificacao()); // imprime 250.0
	}
}
