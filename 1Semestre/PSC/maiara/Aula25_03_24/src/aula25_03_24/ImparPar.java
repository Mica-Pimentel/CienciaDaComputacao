package aula25_03_24;

import java.util.Scanner;

public class ImparPar {
  
    public static void main(String[] args) {
   // 2.Escreva um programa que verifique se um n�mero � par ou �mpar
//6.**Verificar se um n�mero est� no intervalo de 10 a 20**
//7.Verificar se uma pessoa � adolescente (entre 13 e 19 anos) e tem altura superior a 1,60 metros:**
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
