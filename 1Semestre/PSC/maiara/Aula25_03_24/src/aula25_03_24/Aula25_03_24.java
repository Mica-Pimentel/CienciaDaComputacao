package aula25_03_24;

import java.util.Scanner;

public class Aula25_03_24 {

    public static void main(String[] args) {
       //1.Escreva um programa que determine se um n�mero � positivo, negativo ou zero.
        Scanner in = new Scanner(System.in);
        System.out.println("verificar numero -, 0, +"
                + "\nDigite um numero e tecle enter");
         int num = in.nextInt();
         
         if(num == 0){
         System.out.println("O numero � 0");
         }else if( num >0){
         System.out.println("O numero � positivo");
         }else{
         System.out.println("O numero � negativo");
         }
        
    }
    
}
