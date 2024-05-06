package aula29_04_24;

import java.util.Scanner;

/**
 *
 * @author micael
 */
class Produto {

    String nome;
    int quantidade;

    public Produto(String _nome, int _quantidade) {
        this.nome = _nome;
        this.quantidade = _quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean retirarDoEstoque(int _quantidade) {
        if (this.quantidade >= _quantidade) {
            this.quantidade -= _quantidade;
            return true;
        } else {
            return false;
        }
    }
}

class Estoque {

    Produto[] produtos;

    public Estoque(Produto[] produtos) {
        this.produtos = produtos;
    }

    public boolean verificarEstoque(String nomeProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                return produto.retirarDoEstoque(quantidade);
            }
        }
        System.out.println("produto nao encontrado");
        return false;
    }

}

public class Aula29_04_24 {

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Produto[] produtos = {
            new Produto("Tenis Masculino", 20),
            new Produto("Tenis Feminino", 4),
            new Produto("Tenis Masculino Infantil", 0),
            new Produto("Tenis Feminino Infantil", 2)
        };

        System.out.println("""
                           1- Tenis Masculino
                           2-Tenis Feminino
                           3-Tenis Masculino Infantil
                           4-Tenis Feminino Infantil
                            Digite o numero referente ao produto:""");

        int selecione = in.nextInt();

        while (selecione < 1 || selecione > 4) {
            System.out.println("Produto Inválido, tente novamente");
            selecione = in.nextInt();
        }

        String produto = "";
        int quantidade = 0;
        switch (selecione) {
            case 1:
                produto = "Tenis Masculino";
                break;
            case 2:
                produto = "Tenis Feminino";
                break;
            case 3:
                produto = "Tenis Feminino Infantil";
                break;
            case 4:
                produto = "Tenis Masculino Infantil";
                break;
        }
        System.out.println("Insira a quantidade");
        quantidade = in.nextInt();

        System.out.println("Selecione o meio de pagamento (dinheiro ou cartao):");
        String meioPagamento = in.next();
        Estoque estoque = new Estoque(produtos);
        if (estoque.verificarEstoque(produto, quantidade)) {
            System.out.println("Produto " + produto + " selecionado.");
            System.out.println("Quantidade: " + quantidade);

            if (meioPagamento.equalsIgnoreCase("dinheiro")) {
                System.out.println("Pagamento em dinheiro.");
            } else if (meioPagamento.equalsIgnoreCase("cartao")) {
                System.out.println("Pagamento com cart?o.");
            } else {
                System.out.println("Meio de pagamento inválido.");
            }
        }
*/
    public class Aula29_04_24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Produto[] produtos = {
            new Produto("Tenis Masculino", 20),
            new Produto("Tenis Feminino", 4),
            new Produto("Tenis Masculino Infantil", 0),
            new Produto("Tenis Feminino Infantil", 2)
        };

        System.out.println("1- Tenis Masculino");
        System.out.println("2- Tenis Feminino");
        System.out.println("3- Tenis Masculino Infantil");
        System.out.println("4- Tenis Feminino Infantil");
        System.out.println("Digite o número referente ao produto:");

        int selecione = in.nextInt();

        while (selecione < 1 || selecione > 4) {
            System.out.println("Produto Inválido, tente novamente");
            selecione = in.nextInt();
        }

        String produto = "";
        int quantidade = 0;
        switch (selecione) {
            case 1:
                produto = "Tenis Masculino";
                break;
            case 2:
                produto = "Tenis Feminino";
                break;
            case 3:
                produto = "Tenis Masculino Infantil";
                break;
            case 4:
                produto = "Tenis Feminino Infantil";
                break;
        }
        System.out.println("Insira a quantidade");
        quantidade = in.nextInt();

        System.out.println("Selecione o meio de pagamento (dinheiro ou cartao):");
        String meioPagamento = in.next();
        Estoque estoque = new Estoque(produtos);
        if (estoque.verificarEstoque(produto, quantidade)) {
            System.out.println("Produto " + produto + " selecionado.");
            System.out.println("Quantidade: " + quantidade);

            if (meioPagamento.equalsIgnoreCase("dinheiro")) {
                System.out.println("Pagamento em dinheiro.");
            } else if (meioPagamento.equalsIgnoreCase("cartao")) {
                System.out.println("Pagamento com cart?o.");
            } else {
                System.out.println("Meio de pagamento inválido.");
            }
        }
    }
}

    }
