package Funcionarios;

import org.w3c.dom.ls.LSOutput;

public class TesteFuncionarios {
    public static void main(String[] args) {

        //Funcionário é ABSTRATO, portanto NÃO PODE SER INSTANCIADO!
        //Funcionario f = new Funcionario();

        Funcionario gerente = new Gerente("Vini gerente", "47923115495", 15000);
        Funcionario dev = new Dev("joão DEV", "5454545454545", 5000);
        Funcionario designer = new Designer("maria designer", "111111111", 1230);

        System.out.println("Gerente bonificação: " + gerente.getBonificacao());
        System.out.println("Dev bonificação: " + dev.getBonificacao());
        System.out.println("Designer bonificação: " + designer.getBonificacao());

    }
}
