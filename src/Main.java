import java.util.*;

public class Main {
    public static void main(String[] args) {
        Conta contaVini = new Conta(123, 11554, new Cliente("Vini", "16165151", "Dev"));
        Conta contaTeste = new Conta(123, 15648, new Cliente("Teste", "3423445345", "DBA"));

        contaVini.deposita(500);

        contaTeste.deposita(200);

        System.out.println("Total contas: " + Conta.getTotalContas());


        List<Conta> lista = new ArrayList<Conta>();

        lista.add(contaTeste);
        lista.add(contaVini);

        // foreach example
        for (Conta conta : lista) {
            System.out.println("Nome Titular: " + conta.getTitular().getNome());
        }

    }
}