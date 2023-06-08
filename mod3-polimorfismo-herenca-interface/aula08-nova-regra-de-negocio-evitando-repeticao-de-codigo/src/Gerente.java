/********** SURGE UMA NOVA REGRA DE NEGOCIO ************
 * Agora Gerente vai receber:
 * a bonificação padrão de um Funcionario (10%) do salario 
 *                     + 
 * sua antiga Bonificação de Gerente que era (5%) do salario.
 ******************************************************** */

public class Gerente extends Funcionario {

	private int senha;

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
	
	/* - Bonificacao antiga do gerente: 5% do salario
	 * - Bonificacao padrão do Funcionario: 10% do salario
	 * ° Nova regra de negocio: Gerente recebe de Bonificação:
	 * - (a bonificacao padrao do funcionario) + (sua antiga Bonificacao de Gerente)
	 */ 
	
	public double getBonificacao() {
		return (this.salario * 0.1) + (super.salario * 0.05);
		// (this.salario * 0.1)   -> é a Bonificação padrão do Funcionario
		// (super.salario * 0.05) -> é a Bonificação antiga do Gerente
		
		/* Problema: perceba que esse trecho de codigo da Bonificação Padrao do Funcionario
		 *      (this.salario * 0.1)
		 * ele ja ta escrito em Funcionario.
		 * Estamos repetindo codigo ISSO NAO È LEGAL.
		 * 
		 * Da pra reaproveitar o metodo do Funcionario ja que essa parte em
		 * especifico é a mesma coisa. Basta CHAMAR o metodo do Funcionario da seguinte forma:
		 * 
		 *     super.getBonificacao();
		 * 
		 * logo o return vai ficar:
		 * 
		 *    return super.getBonificacao() + (super.salario * 0.05);
		 * 
		 * - Vamos por em pratica isso na proxima AULA.
		 * */
		
	}

}
