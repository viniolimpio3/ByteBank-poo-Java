package Funcionarios;

//Funcionarios.Gerente herda Funcionarios.Funcionario!
public class Gerente extends Funcionario {

    public Gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario); //Executa o construtor de Funcionarios.Funcionario!
    }

    private String senha;

    public boolean autentica (String senha){
        return this.senha.equals(senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Reescrita de métodos! Mesma assinatura da classe Pai.
    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}
