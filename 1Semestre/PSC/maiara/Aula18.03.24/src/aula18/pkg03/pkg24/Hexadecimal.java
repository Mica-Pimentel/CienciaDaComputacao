package aula18.pkg03.pkg24;

import java.util.Scanner;

public class Hexadecimal {
   public static void main(String[] args) {
       //converter decimal para HEXAdecimal
       
       Scanner in = new Scanner(System.in);
       System.out.println("CONVERSOR DE DECIMAL PARA HEXADECIMAL E BINARIO");
       System.out.println("digite o numero decimal a ser convertido");
       int decimal = in.nextInt();
        
       
       
       String hexadecimal= Integer.toHexString(decimal);
       System.out.println("A representaçao hexadecimal é: "+ hexadecimal);
       String binario = Integer.toBinaryString(decimal);
       System.out.println("A representaçcao binario é: "+ binario);
   }
    
    
    
}
