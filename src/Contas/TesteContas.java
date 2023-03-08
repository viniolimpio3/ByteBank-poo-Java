package Contas;

public class TesteContas {
    public static void main(String[] args) {

        Cliente vini = new Cliente("Vinícius", "1111111111", "Dev");
        Cliente joao = new Cliente("João", "222222222", "Dev");

        Conta contaVini = new ContaCorrente(111, 111111, vini);
        contaVini.deposita(100);

        Conta contaJoao = new ContaPoupanca(111, 111111, joao);
        contaJoao.deposita(200);

        boolean transferido = contaVini.transfere(10, contaJoao);

        System.out.println("Transferido: " + transferido);

        System.out.println("Contas.Conta Vini: " + contaVini.getSaldo());
        System.out.println("Contas.Conta João: " + contaJoao.getSaldo());

    }
}
