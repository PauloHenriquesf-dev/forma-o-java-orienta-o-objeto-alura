/*
 * JRE (java runtime environment): Vem com a JVM e as bibliotecas, para programadores isso nao basta.
 * Precisa do JDK. kit para desenvolver uma aplicação java: alem do jdk e as bibliotecas vem com o
 * compilador q vai pegar o codigo java e trasformar no formato q o java vai entender.
 * 
 * Para executar pelo trerminal:
 * usa: java [-options] classe [args...]
 * 
 * obs: nao basta usar esse comando q é quem chama a JVM q é a maquina q vai rodar nossa aplicação,
 * precisa do compilador q vamos escrever o codigo java e compilar p/ uma linguagenzinha q a JVM entende.
 * Esse comandinho é o javac.
 * 
 * Instalando o JDK no Linux:
 * 1) No Linux, primeiramente vamos ter que executar o seguinte comando no terminal:
 * sudo apt update
 * 
 * 2) Feito isso, agora vamos instalar a versão 17 do JDK, que Agora no momento q estou comentando isso
 * é a mais recente, para isso, vamos executar o seguinte comando no terminal:
 * sudo apt install openjdk-17-jdk
 * 
 * 3) Terminado o processo de instalação, chegou a hora de configurar a variável de ambiente JAVA_HOME,
 * que é utilizada para indicar o caminho de instalação do JDK.
 * Em uma tradução literal seria o “lar do java” e ela será necessária para utilizarmos os recursos
 * do JDK como o javac.
 * Para isso, execute o comando sudo update-alternatives --config java que mostrará o caminho onde o JDK
 * foi instalado. O resultado será parecido ou igual a esse:
 * /usr/lib/jvm/java-17-openjdk-amd64/bin/java
 * 
 * Agora, copie esse caminho até /bin, por exemplo: /usr/lib/jvm/java-17-openjdk-amd64/bin e digite
 * no seu terminal o comando: export JAVA_HOME=, sendo que após o sinal de igual, sem deixar espaços,
 * cole o caminho que você copiou da instalação do JDK. Por exemplo:
 * 
 * export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64/bin
 * 
 *  Pressione enter e pronto, seu JDK está instalado e configurado. Para testá-lo,
 *  digite os seguintes comandos no terminal:
 *  javac -version
 *  java -version
 *  
 *  ==================================================================================================
 *  O JRE e JDK. O primeiro é o ambiente de execução, o segundo são as ferramentas de desenvolvimento
 *  junto com o ambiente de execução. Simplificando podemos dizer:
 *  
 *  JDK = JRE + ferramentas de desenvolvimento
 *  
 *  A responsabilidade da Java Virtual Machine é executar o Bytecode!
 *  Então qual é diferença entre JVM e JRE?
 *  O JRE (o nosso ambiente de execução) contém a JVM, mas tmb possui um monte de bibliotecas embutidas.
 *  Ou seja, p/ rodar uma aplicação Java n basta ter apenas a JVM, também é preciso ter as bibliotecas.
 *  Assim podemos simplificar e dizer: 
 *  
 *  JRE = JVM + bibliotecas
 *  
 *  É importante entender que você não pode baixar a JVM apenas.
 *  sempre baixa o JRE q tem a JVM e as bibliotecas em conjunto.
 * 
 *  Beneficio da JVM: executar o código independente do sistema operacional. 
 */
public class Programa {
	
	public static void main(String[] args) {
		
		System.out.println("Sintaxe Básica");
		
	}
}
