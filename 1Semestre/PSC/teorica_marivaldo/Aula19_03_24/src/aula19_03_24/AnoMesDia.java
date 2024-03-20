package aula19_03_24;

import java.util.Scanner;

public class AnoMesDia {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("sistema dias");
        System.out.println("Digite o ano e tecle enter");
        int ano = in.nextInt();
        System.out.println("Digite o mes e tecle enter");
        int mes = in.nextInt();
        System.out.println("digite os dias e tecle enter");
        int dia = in.nextInt();
        
        int ano_dia = ano*365;
        int mes_dia = mes*30;
        int resultado = ano_dia+mes_dia+dia;
        
        System.out.println("A qauntidade de Dias "+resultado);
    }
    
}
