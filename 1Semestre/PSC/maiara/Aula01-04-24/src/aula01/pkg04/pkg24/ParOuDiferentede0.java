package aula01.pkg04.pkg24;

import java.util.Scanner;

public class ParOuDiferentede0{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("VERIFICAR SE É PAR ou diferente de 0\n"
                + "INSIRA UM NUMERO");
        int num = in.nextInt();
        
        if(num%2==0 && num >0){
        System.out.println("O NUMERO É PAR ");
        }else if(num%2 != 0){
             System.out.println("O NUMERO É IMPAR");
        }else{
             System.out.println("O NUMERO É 0");
        }
    }
}