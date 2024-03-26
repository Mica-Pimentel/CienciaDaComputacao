package aula19_03_24;

import java.util.Scanner;

public class VerificarPrimo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int num = in.nextInt();
        
        // verificacao se o numero e primo
        if(num<=1){
            System.out.println("o numero nao e primo");
        }else{
            int contador = 0;
            int div;
            //verifica se o numero é divisivel por algum numero alem de 1 e ele mesmo
            for(div = 2; div <= num; div++ ){
                if(num % div == 0){
                    contador = contador+1;
                }
            }
        
        
            //se o contador chegar a zero, o numero e primo
            if(contador == 0){
                System.out.println("O numero e primo");
            }else{
                System.out.println("O nuemro nao e primo");
            }
        }
    }
    
}
