
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
	
	/* Quando usa THIS pensamos que o atributo foi definido NESSA Classe,
	 * Porem o atributo esta definido na classe MAE (Funcionario) 
	 * Nao vai da erro deixar THIS, mas NAO É BOA PRATICA.
	 * É bom deixar explicito que esse atributo (SALARIO) foi declarado na classe mae,
	 * e para isso usa o SUPER ao inves do THIS.*/
	
	public double getBonificacao() {
		return super.salario * 0.05;
	}
	
	/* ASSINATURA DO METODO getBonificacao la da classe FUNCIOANRIO:
	 * 
	 * Perceba que nosso metodo getBonificacao()
	 * é public; retorna um double; seu nome é getBonificacao; e nao recebe parametros
	 * Essa é sua assinatura.
	 * Aqui em GERENTE temos a mesma assinatura, isso se chama REESCRITA ou SOBRESCRITA 
	 */
}
