
public class Teste {
	
	public static void main(String[] args) {
		
		/*regra de negocio: contas so podem ter Agencia e Numero maiores que ZERO
		 * 
		 * SOLUÇÔES:
		 * - foi criado if's no setNumero e setAgencia que impossibilitam que Agencia e Numero recebam
		 *   valores <= a ZERO
		 * 
		 * - foi criado um construtor que ja recebe 2 valores(Agencia e Numero) e no proprio construtor
		 *   verifica se os valores passados no parametro sao <= a ZERO. 
		 * */
		
		Conta conta = new Conta(11, 1111);
		
		System.out.println(conta.getAgencia()); //imprime 11
		System.out.println(conta.getNumero());  //imprime 1111
		
		//tentando colocar valor negativo na agencia:
		conta.setAgencia(-20); //imprime uma informaçao dizendo que agencia deve ter valor maior que ZERO
		
		System.out.println(conta.getAgencia()); //agencia continua com valor 11
		
		/* Ainda temos um problema: se tentarmos criar uma conta passando valores <= ZERO no construtor,
		 * vai entrar na verificação (if) que tem no construtor e não vai aceitar esses valores.
		 * Porém o objeto não vei deixar de ser criado, Agencia e Numero tera valor padrao (ZERO).
		 * o que nao segue a regra de negocio.
		 * Tem um maneira de fazer o objeto nao ser criado, mas isso vamos aprender mais na frente*/
		
		Conta conta2 = new Conta(-1, -2); // Agencia e Numero da Conta devem ter valores MAIOR que ZERO
		System.out.println(conta2.getAgencia()); //imprime 0
		System.out.println(conta2.getNumero());  //imprime 0
	}
}
