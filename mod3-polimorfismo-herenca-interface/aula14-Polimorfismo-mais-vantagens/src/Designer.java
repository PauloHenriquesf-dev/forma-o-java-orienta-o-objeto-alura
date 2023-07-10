/* Um novo tipo de Funcionario foi criado: DESIGNER (que tambem é um Funcionario).
 * Ao cria-lo não precisou alterar o metodo de somar Bonificoes da classe ControleBonificacao
 * Já q esse metodo utiliza POLIMORFISMO, ele usa um parametro mais gerenrico: Funcionario
 * assim podemos passar tipos mais especificos, como Gerente e o proprio Designer que tambem
 * é um Funcionario (eles extends Funcionario).
 * 
 * Em resumo, o polimorfismo permite que você adicione novos tipos (como o Designer)
 * que sxtends a classe Funcionario sem alterar o método somarBonificacao da
 * classe ControleBonificacao.
 * Isso ajuda a manter o código mais flexível e modular, permitindo que você adicione
 * funcionalidades adicionais sem modificar a implementação existente.
 * 
 * Podemos criar varios tipos que extends Funcionario e o metodo somarBonificacao nao precisa
 * ser alterado.
 * */

public class Designer extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return 1000;
	}
	
}
