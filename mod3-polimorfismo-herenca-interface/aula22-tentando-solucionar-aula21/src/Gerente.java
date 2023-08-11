
public class Gerente extends Funcionario {

	//------- Parte do Codigo responsavel pela Autenticacao do Gerente ---------//
	
	// FOI REMOVIDO E IMPLEMENTADO NA CLASSE FUNCIONARIO,
	// PARA EVITAR A REPETICAO DE CODIGO EM ADMINISTRADOR.
	// AGORA ESSA PARTE DE CODIGO ESTA APENAS EM FUNCIONARIO E GERENTE E ADMINISTRADOR HERDAM
	
	//------- Parte do Codigo responsavel pela Autenticacao do Gerente -----------//
	
	
	@Override
	public double getBonificacao() {
		return super.getSalario(); // recebe de bonificacao o mesmo tanto do seu salario
	}

}
