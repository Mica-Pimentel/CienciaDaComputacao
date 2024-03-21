
package aula19_03_24;

import java.util.Scanner;

public class OperacoesBasicas{

    public static void main(String[] args) {
     
        Scanner ler = new Scanner(System.in);
        
        System.out.println("calculadora simples\n");
        System.out.println("INSIRA O PRIMEIRO NUMERO");
        int a = ler.nextInt();
        System.out.println("INSIRA O SEGUNDO NUMERO");
        int b = ler.nextInt();
        
        System.out.println(
        "RESULTADOS"+
        "\nA soma de: "+ a +" + "+ b+" = "+(a+b) +
        "\nA subtracao de:" + a +" - "+ b+" = "+(a-b)+
        "\nA multiplicacao de:" + a +" x "+ b+" = "+(a*b)+
        "\nA divisao inteira de:" + a +" / "+ b+" = "+(a/b)+
        "\nA divisao exata de:" + a +" /"+ b+" = "+((float)a/b)
       );
        
    }
    
}

