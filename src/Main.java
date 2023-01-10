public class Main {
    public static void main(String[] args) {
        Conta contaVini = new Conta(123, 11554, new Cliente("Vini", "16165151", "Dev"));
        Conta contaTeste = new Conta(123, 15648, new Cliente("Teste", "3423445345", "DBA"));

        contaVini.deposita(500);

        contaTeste.deposita(200);

        System.out.println("Nome titular: " + contaVini.getTitular().getNome());
        System.out.println("Nome titular: " + contaTeste.getTitular().getNome());
        System.out.println("Total contas: " + Conta.getTotalContas());
    }
}