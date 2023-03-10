
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		
		//nao é legal atribuir valores aos atributos de forma direta.
		//devemos fazer isso atraves de metodos.
		
		//colocando 300 no atributo saldo atraves do metodo deposita:
		contaDoPaulo.deposita(300);
		
		System.out.println("Saldo atual: R$ " + contaDoPaulo.saldo); // imprime 300
		
		//testando nosso primeiro metodo com retorno:
		contaDoPaulo.saca(50);
		
		System.out.println("Saldo atual: R$ " + contaDoPaulo.saldo); // imprime 250
		
		/*O metodo saca retorna um boolean (true ou false),
		 *logo podemos guardar seu retorno em uma variavel e manipula-la da fomra que quiser*/
		
		boolean conseguiuSaca = contaDoPaulo.saca(50);// conseguiuSaca tera valor true ou false
		
		//vendo o valor da variavel conseguiuSaca
		System.out.println(conseguiuSaca);
		
		//usando o valor da variavel conseguiuSaca para imprimir uma mensagem na tela:
		if (conseguiuSaca) { // se for true
			System.out.println("Conseguiu sacar!");
		} else { // caso contrario (se for false)
			System.out.println("Não conseguiu sacar!");
		}
	}
}
