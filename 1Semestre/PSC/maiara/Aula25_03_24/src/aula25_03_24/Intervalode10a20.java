package aula25_03_24;

import java.util.Scanner;


public class Intervalode10a20 {
    public static void main(String[] args){
    //6.**Verificar se um número está no intervalo de 10 a 20**
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Verificar se o numero esta no intervalo de 10 a 20"
                +"\nIsira o numero");
        float num = in.nextFloat();
        
        if(num >=10 && num<=20){
            System.out.println("O numero esta dentro do intervalo de 10 a 20");
        }else{
            System.out.println("O numero nao esta dentro do intervalo de 10 a 20");
        }
    
    }
}

