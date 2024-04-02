package aula01.pkg04.pkg24;

import java.util.Scanner;

public class Tabuadaate10 {

    public static void main(String[] args) {
        //4.Escreva um programa que solicita ao usuário um número inteiro positivo e imprime
        //a tabuada desse número até 10.
        Scanner in = new Scanner(System.in);
        System.out.println("Calculadora ate 10"
                + "\nInsira um numero");
        int num = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i + num;
           
            System.out.println(num + "+" + i + "=" + resultado);

        }
    }

}
