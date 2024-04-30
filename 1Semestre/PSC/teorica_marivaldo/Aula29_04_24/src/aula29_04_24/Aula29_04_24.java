package aula29_04_24;

import java.util.Scanner;

/**
 *
 * @author micael
 */
public class Aula29_04_24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Produto produto1 = new Produto("sandalia", 20);
        Produto produto2 = new Produto("sapato", 4);
        Produto produto3 = new Produto("sapatilha", 0);
        Produto produto4 = new Produto("bota", 2);

        System.out.println("selecione os produtos:"
                + "\n" + produto1.nome
                + "\n" + produto2.nome
                + "\n" + produto3.nome
                + "\n" + produto4.nome
        );
    }
}

class Produto {

    String nome;
    int quantidade;

    public Produto(String nomeI, int quantidadeI) {
        this.nome = nomeI;
        this.quantidade = quantidadeI;
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
            return false;
        }
    }
}

class Estoque {

    Produto[] produtos;
}
