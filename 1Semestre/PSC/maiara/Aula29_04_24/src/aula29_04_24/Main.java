package aula29_04_24;
import java.util.Scanner;

class Produto {
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean retirarDoEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            System.out.println("N?o há quantidade suficiente de " + nome + " no estoque.");
            return false;
        }
    }
}

class Estoque {
    private Produto[] produtos;

    public Estoque(Produto[] produtos) {
        this.produtos = produtos;
    }

    public boolean verificarEstoque(String nomeProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nomeProduto)) {
                return produto.retirarDoEstoque(quantidade);
            }
        }
        System.out.println("Produto " + nomeProduto + " n?o encontrado no estoque.");
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Camiseta", 10),
            new Produto("Calça", 5),
            new Produto("Meia", 20)
        };

        Estoque estoque = new Estoque(produtos);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione um produto:");
        String produtoSelecionado = scanner.nextLine();

        System.out.println("Quantidade:");
        int quantidade = scanner.nextInt();

        System.out.println("Selecione o meio de pagamento (dinheiro ou cartao):");
        String meioPagamento = scanner.next();

        if (estoque.verificarEstoque(produtoSelecionado, quantidade)) {
            System.out.println("Produto " + produtoSelecionado + " selecionado.");
            System.out.println("Quantidade: " + quantidade);

            if (meioPagamento.equalsIgnoreCase("dinheiro")) {
                System.out.println("Pagamento em dinheiro.");
            } else if (meioPagamento.equalsIgnoreCase("cartao")) {
                System.out.println("Pagamento com cart?o.");
            } else {
                System.out.println("Meio de pagamento inválido.");
            }
        }

        scanner.close();
    }
}
