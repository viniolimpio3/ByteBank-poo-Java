package Funcionarios;

public class Designer extends Funcionario {

    public Designer(String nome, String CPF, double salario) {
        super(nome, CPF, salario); //Executa o construtor de Funcionarios.Funcionario!
    }

    public double getBonificacao() {
        System.out.println("Chamando método getBonificacao do Designer!");
        return this.getSalario() + 200;
    }
}
