/* Surgiu um novo problema o chefe quer que seja criado uma classe para representar um gerente
 * com: nome, cpf e salario, porem sua bonificacao deve ser diferente. Ao invez de 10% do salario,
 * sua bonificação deve ser 5% do salario.
 * 
 * SOLUÇÂO 1: vamos criar um atributo TIPO que recebe um inteiro, se for:
 * 0: sera um funcionario (comum)
 * 1: sera um gerente
 * 
 * Pq dessa forma não é boa?
 * - aqui so temos funcionario normal e gerente, e se surgissem mais 20 cargos?
 * - teria que ir no metodo getBonificacao e fazer 20 if's e esses if's poderia implicar em outros if's em
 * outros metodos.
 * - teria que saber que o 0 é pro tipo funcionario Comum, que o 1 é pro Gerente que o 2 é pro tipo tau...
 * Fazer esse mapeamento do numero tau é o tipo tau, não é nada bom, cODIGO FICA POUCO EXPRESSIVO.
 * 
 * Outro problema fazendo dessa forma é se o Gerente tiver um senha. Vamos criar um novo atributo aqui
 * 
 * private int senha; 
 * 
 * - porem essa senha aqui tambem iria ser um atributo pro funcionario comum
 * sendo q apenas Gerente poderia ter senha.
 * 
 * seria melhor uma solução2: utilizar HERANCA, criar uma classe especifica Gerente que vai herdar alguns
 * atributos de funcionario, alem de ter seu proprio atributo senha que nao tera em funcionario.
 * (veremos isso na proxima aula, aqui vc pode verificar a solucao1, e ver que ela nao é legal)
 * */
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	private int tipo;
	
	public double getBonificacao() {
		
		if (tipo == 0) { // se for funcionario comum
			return this.salario * 0.1;
		} else if (tipo == 1) { // se for Gerente
			return this.salario * 0.05;
		} else { // se nao for Funcionario comum nem Gerente
			return 0;
		}
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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
