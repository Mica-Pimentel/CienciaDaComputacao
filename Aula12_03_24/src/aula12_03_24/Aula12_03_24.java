package aula12_03_24;

import java.util.Scanner;

public class Aula12_03_24 {

    public static void main(String[] args) {
     
        //crie um programa para exibir o maior numero
        
        Scanner ler = new Scanner(System.in);
        
        float a, b;
        System.out.println("insira o primeiro numero");
        a = ler.nextFloat();
        System.out.println("insira o segundo numero");
        b = ler.nextFloat();
        
        if(a>b){
        System.out.println("o maior nuemro e: "+ a);
        }if(a<b){
            System.out.println("o maior numero e: "+ b);
        }else{
            System.out.println("os numeros sao iguais " +a+" = "+b);
        }
        
    }
    
}
