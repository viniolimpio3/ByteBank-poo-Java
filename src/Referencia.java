public class Referencia {
    public static void main(String[] args) {
        Conta primeira = new Conta();

        primeira.deposita(300);
        System.out.println("Saldo primeira conta: " + primeira.getSaldo());

        Conta segunda = primeira; //'primeira' NÃO É UM OBJETO!, mas uma referência ao objeto guardado na memória!!
        // Apenas o "new" define um NOVO OBJETO!!

        segunda.deposita(200);
        System.out.println("Saldo primeira conta, referência segunda conta: " + primeira.getSaldo());

        System.out.println("(Hexa) Referência primeira conta: " + primeira + " " +
                "\n(Hexa) Referência segunda conta: " + segunda);
    }
}
