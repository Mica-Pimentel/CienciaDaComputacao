package pilha;

import java.util.Stack;
import java.util.Scanner;

public class DesafioPilha1 {

    public static void main(String[] agrs) {
        //declara?ao da pilha 
        Stack<String> pilhaDeLivros = new Stack<>();
        pilhaDeLivros.push("livro1");
        pilhaDeLivros.push("livro2");
        pilhaDeLivros.push("livro3");
        pilhaDeLivros.push("livro4");
        pilhaDeLivros.push("livro5");
        pilhaDeLivros.push("livro6");
        pilhaDeLivros.push("livro7");
        pilhaDeLivros.push("livro8");
        pilhaDeLivros.push("livro9");
        Scanner in = new Scanner(System.in);
        System.out.println("digite o livro a ser adicionando a pilha:");
        pilhaDeLivros.push(in.nextLine());
        System.out.println("lista de livros inseridos");

        System.out.println(pilhaDeLivros);

        // remo?ao do ultimo item
        System.out.println("remo?ao do ultimo item:");
        String livroRemovido = pilhaDeLivros.pop();
        System.out.println("item removido: "
                + livroRemovido + "\nitens restantes: " + pilhaDeLivros);

    }
}
