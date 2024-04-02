package aula01.pkg04.pkg24;

import java.util.Scanner;

public class ParOuPositivo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VERIFICAR SE É PAR\n"
                + "INSIRA UM NUMERO");
        int num = in.nextInt();
        
        if(num%2==0 && num >0){
        System.out.println("O NUMERO É PAR POSITIVO");
        }else if(num%2 != 0 && num>0){
             System.out.println("O NUMERO É IMPAR POSITIVO");
        }else if(num%2 == 0 && num<0){
             System.out.println("O NUMERO É PAR NEGATIVO");
        }else{
            System.out.println("O NUMERO É IMPAR NEGATIVO");
        }
    }
}
