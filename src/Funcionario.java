import java.util.Currency;

public class Funcionario {

    public Funcionario(String nome, String CPF, double salario){
        setNome(nome);
        setCPF(CPF);
        setSalario(salario);
    }
    private String nome;
    private String CPF;
    private double salario;

    public double getBonificacao(){
        return this.getSalario() * .5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
