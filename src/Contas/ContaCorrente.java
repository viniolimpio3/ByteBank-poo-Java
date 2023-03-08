package Contas;

public class ContaCorrente extends Conta {

    private double taxaDeSaque = .2;
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);

    }

    @Override
    public boolean saca(double valor) {
        valor += this.taxaDeSaque;
        return super.saca(valor);
    }
}
