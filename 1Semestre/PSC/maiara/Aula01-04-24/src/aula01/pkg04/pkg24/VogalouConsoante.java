package aula01.pkg04.pkg24;

import java.util.Scanner;

public class VogalouConsoante {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VERIFICAR SE É UMA VOGAL OU UM NUMERO"
                + "\nINSIRA UM DIGITO");
        String c = in.nextLine();
        if (c.equals("a") || c.equals("e")|| c.equals("i")|| c.equals("o")|| c.equals("u")) {
            System.out.println("O caractere é uma vogal");
        } else{
            System.out.println("O caractere não é uma vogal");
        }

    }
}
