package aula25_03_24;

import java.util.Scanner;

public class ImparPar {
  
    public static void main(String[] args) {
   // 2.Escreva um programa que verifique se um n�mero � par ou �mpar
        Scanner in = new Scanner(System.in);
        System.out.println("Verificar numero impar ou par"+
                "\nDigite um numero e tecle enter ");
        int num = in.nextInt();
         
        if(num % 2  == 0 ){
        System.out.println("O numero � par");
        }else{
        System.out.println("O numero � �mpar");
        }
    }
    
}
