package Parte2;

import java.util.Scanner;

public class NvezesNome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("imprime nome n vezes"
                + "\n Insira um nome:");
        String nome = in.nextLine();
        System.out.println("Insira o numero de vezes a repetir o nome:");
        int contador = in.nextInt();
        int i = 1;
        while (i <= contador) {
            System.out.println(nome);
            i = i + 1;
        }
    }
}
