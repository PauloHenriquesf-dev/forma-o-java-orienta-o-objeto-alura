/* uma classe abstrata é uma classe que não pode ser instanciada diretamente,
 * o que significa que você não pode criar objetos diretamente a partir dela.
 * Ela é projetada para ser uma classe base que serve de modelo para outras classes
 * derivadas (subclasses, classes filhas).
 * As classes abstratas fornecem uma estrutura comum para essas subclasses,
 * definindo atributos e métodos que elas devem implementar.
 * Uma classe abstrata pode conter tanto métodos abstratos quanto métodos concretos.
 * 
 * Ex:
 * - temos uma classe Animal que tem atributos:
 * cor, quantidadeDePatas, idade...
 * 
 * - e o seguinte metodo abstrato (metodos abstratos nao possuem "corpo", implementacao):
 * comer()
 * 
 * E tem classes filhas: Cachorro e Gato que herda de Animal.
 * 
 * Perceba que quando se pergunta que animal é esse? vc responde é um cachorro, ou é um gato
 * Vc nao responde esse animal é animal, fica algo estranho, da pra notar que animal é algo
 * abstrato.
 * 
 * Logo Funcionario sera algo absrato pq na verdade quando perguntar que funcionario é esse?
 * ele sera um Gerente, ou EditorDeVideo. Nao tem cargo Funcionario, Funcionario é abstrato. 
 * Assim ao tornar a classe Funcionario abastrata, nao pode ser criado um objeto do tipo
 * Funcionario.
 * 
 * Em resumo usamos uma clase abstrata quando: deseja criar uma classe que serve como
 * uma estrutura base para outras classes relacionadas, mas não pretende criar instâncias
 * diretas dessa classe base. Em vez disso, você quer que as classes derivadas (subclasses)
 * estendam essa classe abstrata e implementem ou sobrescrevam seus métodos abstratos
 * de acordo com suas necessidades específicas.
 * 
 * */

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
