package aula19_03_24;

import java.util.Scanner;

public class Aula19_03_24 {
    public static void main(String[] args) {
        
        // Escreva um programa Java que verifique se um número fornecido pelo usuário é primo ou não.
        
        Scanner ler = new Scanner(System.in);
        
         int num = ler.nextInt();
        /*
         for(int i = 1; i < numero; i++){
        if((i==1) && (i>1)){
        System.out.println("o numero e primo");
        }else{
        System.out.println("O nuemro nao e primo ");
        }
        }*/
        
        System.out.println("NUMEROS PRIMOS OU NAO\n ISIRA UM NUMERO");
        for(int i=2;i<=num; i++){
            boolean primo = true;
            for(int j =2; j < i; j++){
                if (1 % j ==0){
                    primo = false;
                }
            }
            if(primo){
            System.out.println(i);
            }
        }
        
        
    }
    
}
