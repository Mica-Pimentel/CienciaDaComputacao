package aula19_03_24;
import java.util.Scanner;
public class Temperatura {

    public static void main(String[] args) {
        System.out.println("Conversor de celsius para fahrenheit e vice versa:\n ");
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite 1 para fahrenheit para celsius e 2 para celsius para fahrenheit");
        int a = ler.nextInt();
        System.out.println("Digite a temperatura a ser convertida");
        float n = ler.nextFloat();
        float c = ((n*9/5)+32);
        float f = ((n-32)*5/9);
        if(a == 1){System.out.println( "o valor de " +n + " em celsius e " + f );
        }else if(a == 2){System.out.println( "o valor de " +n + " em fahrenheit e " + c);
        }else{System.out.println("erro");}
        }
    }

