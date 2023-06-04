/* Aqui em gerente retiramos todos os codigos repetidos que ja foram definidos em Funcionario
 * como os atributos: NOME, CPF, e SALARIO. E alguns metodos getters e setters.
 * 
 *  Resumo: Apagamos tudo de Gerente que ja foi Definido em Funcionario.
 *  Agora temos que falar: Olha Gerente se vc tem tudo o que um Funcionario tem
 *  GERENTE É UM FUNCIONARIO.
 *  - Temos só que arrumar um jeito de fazer Gerente receber todas essas caracteristicas de um Funcionario.
 *  Tem como falar "olha Gerente se vc é um Funcionario HERDE tudo de Funcionario"?
 *  - Sim, pelo HERANCA que usa a palavra reservada (EXTENDS) */


//GERENTE eh um FUNCIONARIO, GERENTE HERDA da Classe FUNCIONARIO
public class Gerente extends Funcionario {

	private int senha;
	
	//=-=-=-=--=-=-Erro no Metodo getBonificacao =-=-=-=-=-=-=--=-=
	
	/* Esse metodo getBonificacao foi declarado na classe Funcionario e fizemos Gerente Herdar
	 * porem em sua implementacao ele retorna 5% do atributo Salario.
	 * So que salario apesar do Gerente Herdar de Funcionario, esse atibuto foi declarado em Funcionario
	 * e como Salario esta PRIVATE essa classe Gerente nao consegue enxergar
	 * 
	 * Na proxima aula vamos resolver esse problema*/
	
	//public double getBonificacao() {
	//	return this.salario * 0.05;
	//}
	
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-
	
	//metodo para alterar a senha do Gerente
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
}
