public class Main {
    public static void main(String[] args) {
        Conta contaVini = new Conta();
        Conta contaTeste = new Conta();

        Cliente vini = new Cliente();
        Cliente teste = new Cliente();

        vini.setNome("Vini");
        vini.setCpf("12343556445");
        vini.setProfissao("Dev");

        teste.setNome("Teesttee");
        teste.setCpf("453453453453");
        teste.setProfissao("DBA");


        contaVini.setTitular(vini);
        contaVini.deposita(500);
        contaVini.setAgencia(123);
        contaVini.setNumero(111154);


        contaTeste.setTitular(teste);
        contaTeste.deposita(200);
        contaTeste.setAgencia(123);
        contaTeste.setNumero(111154);

        System.out.println("Nome titular: " + contaVini.getTitular().getNome());
        System.out.println("Nome titular: " + contaTeste.getTitular().getNome());

        
    }
}