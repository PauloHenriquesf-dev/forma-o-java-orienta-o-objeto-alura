
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeConta; // static, atributo da CLASSE
	
	public Conta(int agencia, int numero) {
		if (agencia <= 0 || numero <= 0) {
		} else {
			Conta.totalDeConta++;
			this.agencia = agencia;
			this.numero = numero;
			//aqui no construtor N tem mais algo p/ mostar pro usuario que foi criado uma conta
			//agora vamos acessar o atributo totalDeConta la na main.
			//perceba que o totalDeConta esta privado, deve criar metodo get.
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia deve ter valor MAIOR que ZERO");
		} else {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero deve ter valor MAIOR que ZERO");
		} else {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public boolean saca(double valorASacar) {
		if (this.saldo >= valorASacar) {
			this.saldo -= valorASacar;
			return true;
		}
		return false;
	}
	
	public void deposita(double valorADepositar) {
		this.saldo += valorADepositar;
	}
	
	public boolean transfere(double valorATransferir, Conta contaDestino) {
		if (this.saca(valorATransferir)) {
			contaDestino.deposita(valorATransferir);
			return true;
		}
		return false;
	}
	
	//por boas praticar é bom colocar que o esse metodo é static,
	//dessa forma la na main é possivel invoca-lo atraves da classe Conta
	//nao precisa usar os objetos que foram instanciados.
	//vc faz: Conta.getTotalDeContas();    ai inves de: conta1.getTotalDeContas();
	
	public static int getTotalDeContas() {
		return Conta.totalDeConta;
		
		//OBS: dentro do metodo static nao existe THIS ou algo que infere THIS
		//EX: se eu tentar acessar aqui this.saldo DA ERRO
		
		//EX: acessar apenas saldo sem usar o THIS, Tambem da erro (infere o this), ele
		//sabe que o saldo é daquele objeto que ta sendo referenciado ESSE(THIS) mesmo
		//n usando o THIS.
		
		//RESUMINDO: metodos static so acessa atributos static daquela classe.
	}

}
