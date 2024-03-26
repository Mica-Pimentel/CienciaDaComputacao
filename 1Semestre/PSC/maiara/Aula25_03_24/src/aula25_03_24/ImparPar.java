package aula25_03_24;

import java.util.Scanner;

public class ImparPar {
  
    public static void main(String[] args) {
   // 2.Escreva um programa que verifique se um número é par ou ímpar
        Scanner in = new Scanner(System.in);
        System.out.println("Verificar numero impar ou par"+
                "\nDigite um numero e tecle enter ");
        int num = in.nextInt();
         
        if(num % 2  == 0 ){
        System.out.println("O numero é par");
        }else{
        System.out.println("O numero é ímpar");
        }
    }
    
}
