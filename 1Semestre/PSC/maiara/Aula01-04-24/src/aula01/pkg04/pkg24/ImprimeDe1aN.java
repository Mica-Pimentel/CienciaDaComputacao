package aula01.pkg04.pkg24;

import java.util.Scanner;

public class ImprimeDe1aN {
    //5.Escreva um programa que solicita ao usu�rio um n�mero inteiro 
    //positivo N e imprime os n�meros de 1 at� N usando um la�o while.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("insira um numero");
        int num = in.nextInt();
        System.out.println("resultado");
        int contador = 1;
        while(contador <= num){
            System.out.println(contador);
            contador ++;
        }
                
        
    }
}
