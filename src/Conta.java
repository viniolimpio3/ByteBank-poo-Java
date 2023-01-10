class Conta {
    //Construtor
    public Conta() {

    }

    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    private int agencia;
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    private int numero;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    private Cliente titular;
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

}
