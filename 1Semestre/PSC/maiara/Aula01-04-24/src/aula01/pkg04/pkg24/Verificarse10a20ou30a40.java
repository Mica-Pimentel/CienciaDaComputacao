package aula01.pkg04.pkg24;

import java.util.Scanner;

public class Verificarse10a20ou30a40 {

    public static void main(String[] agrs) {
        System.out.println("verificar se o numeo esta entre 10 a 20 ou 30 a 40"
                + "\nInsira um numero inteiro");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num >= 10 && num <= 20) {
            System.out.println("O numero está entre o intervalo de 10 a 20");
        } else if (num >= 30 && num <= 40) {
            System.out.println("O numero está entre o intervalo de 30 a 40");
        } else {
            System.out.println("O numero nõo está entre os intervalos de 10 a 20 e 30 a 40");
        }

    }
}
