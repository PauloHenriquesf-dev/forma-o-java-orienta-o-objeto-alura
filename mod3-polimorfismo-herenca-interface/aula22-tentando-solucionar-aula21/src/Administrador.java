
public class Administrador extends Funcionario {
	
	@Override
	public double getBonificacao() {
		return 1200;
	}
	
	//------- Parte do Codigo responsavel pela Autenticacao do Administrador ---------//

	// FOI REMOVIDO E IMPLEMENTADO NA CLASSE FUNCIONARIO,
	// PARA EVITAR A REPETICAO DE CODIGO EM GERENTE.
	// AGORA ESSA PARTE DE CODIGO ESTA APENAS EM FUNCIONARIO E GERENTE E ADMINISTRADOR HERDAM
	
	//------- Parte do Codigo responsavel pela Autenticacao do Administrador -----------//
	
}
