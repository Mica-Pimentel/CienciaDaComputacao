package aula19_03_24;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        System.out.println("Calculadora de imc: ");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome e tecle enter: ");
        String n = ler.nextLine();
        System.out.println("Digite sua altura e tecle enter: ");
        float a;
        a = ler.nextFloat();
        System.out.println("Digite seu peso e tecle enter: ");
        float p = ler.nextFloat();
        float r = p/(a*a);
        if(r<18.5){System.out.println(n + " seu IMC é "+ r +" e seu peso está baixo.");
        }else if(r>18.5 & r<24.9){System.out.println( n + " seu IMC é "+ r +" e seu peso está normal. ");
        }else if(r>=25 & r<29.9){System.out.println( n + " seu IMC é "+ r +" e voce está com excesso de peso. ");
        }else if(r>=30 & r<34.9){System.out.println(n + " seu IMC é "+ r +" e voce está com obesidade tipo I. ");
        }else if(r>=35 & r<39.9){System.out.println( n + " seu IMC é "+ r +" e voce está com obesidade tipo II. ");
        }else if(r>=40){System.out.println( n + " seu IMC é "+ r +" e voce está com obesidade morbida. ");
        }else {System.out.println("ERRO");}       
        
    }
    
}

