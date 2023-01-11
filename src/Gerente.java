//Gerente herda Funcionario!
public class Gerente extends Funcionario {

    public Gerente(String nome, String CPF, double salario) {
        super(nome, CPF, salario); //Executa o construtor de Funcionario!
    }

    private String senha;

    public boolean autentica (String senha){
        return this.senha == senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Reescrita de métodos! Mesma assinatura da classe Pai.
    @Override
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }
}
