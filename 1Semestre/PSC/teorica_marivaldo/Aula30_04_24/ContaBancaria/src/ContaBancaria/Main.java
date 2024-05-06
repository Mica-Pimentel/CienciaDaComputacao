package ContaBancaria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.criarConta(10203040, 1234);
        caixa.criarConta(10203041, 1234);

        System.out.println("insira o numero da conta");
        int conta = in.nextInt();
        System.out.println("insira a senha conta");
        int senha = in.nextInt();
        System.out.println("insira o valor a sacar");
        double valor = in.nextDouble();

        try {
            caixa.depositar(conta, senha, valor);
            System.out.println("Saldo: " + caixa.verificarSaldo(conta, senha));
            caixa.sacar(conta, senha, 23);
            System.out.println("Saldo apois o saque: " + caixa.verificarSaldo(conta, senha));

        } catch (ContaInexistenteException | SaldoInsuficienteException e) {
            e.printStackTrace();
        }

    }
}
