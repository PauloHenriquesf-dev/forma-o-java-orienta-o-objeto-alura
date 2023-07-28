/* Regra: na contaCorrente ao sacar é cobrado uma taxa de 20 centavos */

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	/* sobrescrevendo metodo da classe mae (classe Conta) 
	 * Para sobrescrever um metodo deve estar tudo igual:
	 * visibilidade, retorno, nome e parametros
	 * 
	 * se nao usar o "Override" e se alguma coisa estiver diferente (nome do metodo,
	 * parametro...), nao vai apresentar erro, pois vai pensar que é um metodo novo que
	 * esta sendo criado. Consequentemente nao vai ter a sobrescriata do metodo desejado.
	 * */
	
	/* Essa anotação "@Override" é opcional, mas é considerada uma prática recomendada
	 * porque ajuda a evitar erros de sintaxe e aprimora a legibilidade do código,
	 * deixando claro que o método está pretendendo sobrescrever um método existente.
	 * Logo usando "@Override" e tendo algo diferente, vc sera avisado q tem algo errado.*/
	
	@Override
	public boolean sacar(double valorASacar) {
		double taxa = 0.2;
		return super.sacar(valorASacar + taxa); // vai chamar o metodo da classe Conta (MAE)
	}
	
	/* Em resumo, A anotação @override é uma forma de garantir que estamos na verdade
	 * sobrescrevendo um método e não criando um novo */
}
