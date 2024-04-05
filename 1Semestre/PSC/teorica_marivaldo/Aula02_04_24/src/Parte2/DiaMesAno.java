package Parte2;

import java.util.Scanner;

public class DiaMesAno {

    public static void main(String[] args) {
        /*
        3 - Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
        meses e dias e mostre-a expressa em dias. Leve em consideração o ano com
        365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         */

        Scanner in = new Scanner(System.in);

        System.out.println("conversor de ano e mês para dias"
                + "\nInsira o ano");
        int ano = in.nextInt();
        System.out.println("Insira o mês");
        int mes = in.nextInt();
        System.out.println("Insira os dias");
        int dia = in.nextInt();
        
        int anoDia=ano*365;
        int mesDia=mes*30;
        int totalDias = anoDia + mesDia + dia;
        
        System.out.println("o total de dias é:" + totalDias);
    }
}
