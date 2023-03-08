package Funcionarios;

public class Dev extends Funcionario{


    public Dev(String nome, String CPF, double salario) {
        super(nome, CPF, salario);
    }

    @Override
    public double getBonificacao() {
        return this.getSalario() + 2000;
    }
}
