package Contas;

public class Cliente {

    public Cliente(String nome, String cpf, String profissao){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setProfissao(profissao);
    }

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String cpf;
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String profissao;
    public String getProfissao() {
        return this.profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
