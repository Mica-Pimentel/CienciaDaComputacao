package aula01.pkg04.pkg24;

import java.util.Scanner;

public class DivisivelPor3e5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VERIFICAR SE O NUEMRO É  DIVISIVEL POR 2 E 5"
                + "\nINSIRA UM NUMERO");

        int num = in.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("o numero é divisivel por 3 e por 5");
        }else{
            System.out.println("O numero nao é divisivel por 3 e por 5");
        }
    }

}
