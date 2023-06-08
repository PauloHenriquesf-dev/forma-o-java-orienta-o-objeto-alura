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
	
	// Bonificacao padrao do funcionario (10% do salario) ja foi implementada em Funcionario
	// entao é so chamar o metodo getBonificacao() da classe mae(Funcionario), usando super: 
	public double getBonificacao() {
		return super.getBonificacao() + (super.salario * 0.05);
		
		/* como tava o return nesse metodo: return (this.salario * 0.1) + (super.salario * 0.05);
		 * 
		 * como o this.salario * 0.1 ja esta implementado no getBonificacao em Funcionario
		 * nao precisa REPETIR CODIGO, basta reutilizar o metodo da classe mae atraves do super
		 * 
		 * CONCLUSAO: em metodos das classes filhas podemos reutilizar metodos da classe mae
		 * para evitar duplicação/repeticao de codigo.
		 * 
		 * 
		 * -=-=-=-=-=-= ALGUNS BENEFICIOS DE APROVEITAR METODOS DA CLASSE MAE =-=-==-=-=-=-=-=
		 * 
		 * ° Reutilização de código: Ao aproveitar os métodos existentes na classe mãe,
		 * você evita duplicação de código. Isso significa que você pode escrever o código uma vez
		 * e reutilizá-lo em várias classes filhas, economizando tempo e esforço na implementação.
		 * 
		 * ° Manutenção simplificada: Quando você tem métodos compartilhados nas classes filhas,
		 * qualquer alteração/correção necessária nesses métodos pd ser feita apenas na classe mãe.
		 * Isso evita a necessidade de fazer as mesmas alterações em várias classes filhas,
		 * tornando a manutenção mais fácil e menos propensa a erros.
		 */
	}

}
