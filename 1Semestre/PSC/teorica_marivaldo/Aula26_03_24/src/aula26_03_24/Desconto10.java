package aula26_03_24;

import java.util.Scanner;

public class Desconto10 {
    
    /*2 - Elabore um programa que receba o nome de um produto e o seu valor e imprima o
        nome do produto, valor e o valor com desconto. O desconto é 10%
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("CALCULADOR DE DESCONTO"
        +"\nInsira o nome do produto");
        String produtos = in.nextLine();
        System.out.println("Insira o preço do produto");
        double valorTotal = in.nextDouble();
        
        // Calcula a porcentagem
        double resultado = valorTotal-(valorTotal/10);
        // Imprime o resultado
        System.out.println("produto: "+ produtos
                +"\nvalor normal: "+ valorTotal
                +"\nvalor com desconto: "+resultado);
  
    }
}
