package aula01.pkg04.pkg24;

import java.util.Scanner;

public class ParOuPositivo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VERIFICAR SE � PAR\n"
                + "INSIRA UM NUMERO");
        int num = in.nextInt();
        
        if(num%2==0 && num >0){
        System.out.println("O NUMERO � PAR POSITIVO");
        }else if(num%2 != 0 && num>0){
             System.out.println("O NUMERO � IMPAR POSITIVO");
        }else if(num%2 == 0 && num<0){
             System.out.println("O NUMERO � PAR NEGATIVO");
        }else{
            System.out.println("O NUMERO � IMPAR NEGATIVO");
        }
    }
}
