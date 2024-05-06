package ContaBancaria;

public class ContaCliente {

    private int numeroConta;
    private int senha;
    private double saldo;

    public ContaCliente(int numeroConta, int senha) {
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo = valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
        saldo -= valor;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

}
