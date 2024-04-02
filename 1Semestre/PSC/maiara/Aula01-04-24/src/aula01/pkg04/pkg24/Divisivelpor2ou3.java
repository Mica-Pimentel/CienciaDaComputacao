package aula01.pkg04.pkg24;

import java.util.Scanner;

public class Divisivelpor2ou3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VERIFICAR SE O NUEMRO É  DIVISIVEL POR 2 ou3 "
                + "\nINSIRA UM NUMERO");

        int num = in.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("o numero é divisivel por 3 ou por 2");
        } else  {
            System.out.println("o numero é divisivel por 3 ou por 2");
        }
    }

}


