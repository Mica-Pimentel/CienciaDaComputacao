package pilha;

import java.util.Stack;

public class Pilha {

    public static void main(String[] agrs) {
        //declara?ao da pilha 
        Stack<String> pilhaDeLivros = new Stack<>();
        //adicionando livros a pilha
        pilhaDeLivros.push("livro1");
        pilhaDeLivros.push("livro2");
        pilhaDeLivros.push("livro3");
        pilhaDeLivros.push("livro4");
        pilhaDeLivros.push("livro5");
        pilhaDeLivros.push("livro6");
        pilhaDeLivros.push("livro7");
        pilhaDeLivros.push("livro8");
        pilhaDeLivros.push("livro9");

        //removendo livro do topo(pop)
        String livroLido = pilhaDeLivros.pop();
        System.out.println("livro Lido: " + livroLido
                + "\nLivro removido: " + pilhaDeLivros);

    }
}
