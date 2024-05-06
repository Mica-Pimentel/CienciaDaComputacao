package ContaBancaria;

import java.util.Map;
import java.util.HashMap;

public class CaixaEletronico {

    private Map<Integer, ContaCliente> contas;

    public CaixaEletronico() {
        this.contas = new HashMap<>();
    }

    public void criarConta(int numeroConta, int senha) {
        contas.put(numeroConta, new ContaCliente(numeroConta, senha));

    }

    public void depositar(int numeroConta, int senha, double valor) {
        ContaCliente conta = contas.get(numeroConta);
        if (conta != null && conta.getSenha() == senha) {
            conta.depositar(valor);
        }
    }

    public void sacar(int numeroConta, int senha, double valor) throws ContaInexistenteException, SaldoInsuficienteException {
        ContaCliente conta = contas.get(numeroConta);
        if (conta == null) {
            throw new ContaInexistenteException("conta nao encontrada");
        } else if (conta != null && conta.getSenha() == senha) {
            conta.sacar(valor);
        } else if (conta == null && conta.getSenha() != senha) {
            throw new ContaInexistenteException("conta nao encontrada");
        }

    }

    public double verificarSaldo(int numeroConta, int senha) throws ContaInexistenteException {
        ContaCliente conta = contas.get(numeroConta);
        if (conta != null && conta.getSenha() == senha) {
            return conta.getSaldo();
        } else {
            throw new ContaInexistenteException("conta nao encontrada");
        }
    }

}

