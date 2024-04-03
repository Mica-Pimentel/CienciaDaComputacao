

import java.util.Scanner;

public class JovemOuIdoso {

   
    public static void main(String[] args) {
     
        System.out.println("Verificar idade"
                + "\n insira uma idade");
        Scanner in = new Scanner(System.in);

        int idade = in.nextInt();

        if (idade < 18) {
            System.out.println("A pessoa e menor de idade");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("A pessoa é maior de idade e um adulto jovem");
        } else if (idade >= 26 && idade <= 60) {
            System.out.println("A pessoa é maior de idade e um adulto");
        } else {
            System.out.println("A pessoa ja é idosa");
        }

    }

}
