
public class Teste {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setSenha(2222);
		
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.checarAutenticacao(cliente1); // pode entrar
		
		/* Fazendo Auteticavel nao herdar de Funcionario resolve o problema do Cliente
		 * Cliente nao tem mais bonificacao.
		 * porem Gerente e Administrador que devem ter bonificacao por serem Funcionarios
		 * não terão mais, pois deixam de ser Funcionario, ja que sao filhos de Autenticavel
		 * e Altenticavel nao herda mais de Funcionario.
		 * 
		 * É possivel q Gerente herde de Autenticavel para ter uma senha e entrar no sistema
		 * e ao mesmo tempo Gerente herdar de Funcionario para ter bonificacao e salario?
		 * 
		 * NAO! POIS EM JAVA NAO TEM HERANÇA MULTIPLA
		 * em Java, uma classe só pode herdar de uma única classe mãe.*/
		
	}
}
