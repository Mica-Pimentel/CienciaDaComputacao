package aula01.pkg04.pkg24;

import java.util.Scanner;

public class ParMenorde50ouImparMaiorde50 {

    public static void main(String[] agrs) {
        System.out.println("verificar se o numero e par e menor que 50 ou impara maior que 50"
                + "\nInsira um numero inteiro");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num%2 == 0 && num <=50) {
            System.out.println("O numero é par e é menor que 50");
        } else if ( num % 2 != 0 && num <= 50) {
            System.out.println("O numero é impar e é menor que 50");
        } else if ( num % 2 != 0 && num >= 50) {
            System.out.println("O numero é impar e é maior que 50");
        }else  {
            System.out.println("O numero é par e é maior que 50");
        }

    }
}
