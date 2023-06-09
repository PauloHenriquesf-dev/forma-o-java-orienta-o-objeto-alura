/*********** A Herança possui 2 pilares ***********************
 * 
 * (O que foi visto ate agora)
 * 
 * - 1° Reutilização de código:
 * A herança permite que uma classe herde os atributos e métodos de uma classe existente,
 * possibilitando a reutilização de código. A classe que herda é chamada de classe filha ou
 * subclasse, enquanto a classe original é chamada de classe base ou superclasse, ou classe MAE.
 * A classe filha herda os membros públicos e protegidos da superclasse,
 * podendo adicionar novos membros ou modificar o comportamento dos membros herdados.
 * 
 * (o que vamos ver)
 *  
 * - 2° Polimorfismo:
 * O polimorfismo permite q um objeto seja tratado de diferentes formas com base na sua classe.
 * Isso significa que um objeto pode ser referenciado pelo tipo de sua superclasse(classe Mae),
 * mas executar o comportamento específico definido em sua própria classe.
 * O polimorfismo facilita a flexibilidade e a extensibilidade do código, pois permite que
 * diferentes objetos compartilhem um conjunto comum de métodos, mas possam responder de 
 * maneira diferente a esses métodos com base em suas próprias implementações.
 * 
 * Ficará mais facil de entender o Polimorfismo mais na frente, enquanto isso veja nessa aula11
 * em 'TesteReferencia' o uso do polimorfismo
 * */
public class Funcionario {
	
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
