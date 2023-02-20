
public class CriaContas {
	
	public static void main(String[] args) {
		
		//contaA é uma referencia para o objeto criado
		Conta contaA = new Conta();
		contaA.saldo = 200;
		
		//somando 100 reais ao que ja tem no saldo da contaA
		contaA.saldo += 100;
		
		//criando uma instancia nova: vai ser pego um espaço de memoria para os 4 atributos da Conta que
		//sera guardado no endereço X. Esse endereço de memoria fica guardado na nossa variavel contaB
		//por isso contaB fica sendo a referencia do objeto criado. Ela tem seu endereço de memoria.
		Conta contaB = new Conta();
		
		//contaB tem o endereço de memoria do objeto criado, logo atraves dele conseguimos acessar seus
		//atributos. Entao para acessar o atributo saldo de contaB e jogar 500 é da seguinte forma:
		contaB.saldo = 500;
		
		//Apesar das duas serem Contas sao objetos diferentes, cada conta tem sua referencia
		//atraves da referencia sabemos se ORIENTAR(Orientação obj)) a qual conta estamos se referindo.
		System.out.println("Saldo contaA: " + contaA.saldo);
		System.out.println("Saldo contaB: " + contaB.saldo);
	}
}
