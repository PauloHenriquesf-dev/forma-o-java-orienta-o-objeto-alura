// Funcionario tem varias nomeclaturas: Classe MAE, classe BASE, ou SUPER CLASSE
// Gerente vai ser a classe FILHA
// EXTENDS: Herda, ou "é um"
// Gerente extends Funcionario: vc ta dizendo Gerente Herda, ou é um Funcionario

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        return this.salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}