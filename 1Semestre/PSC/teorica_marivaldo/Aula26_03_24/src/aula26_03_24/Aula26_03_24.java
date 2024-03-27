package aula26_03_24;

import java.util.Scanner;

public class Aula26_03_24 {

  
    public static void main(String[] args) {
       /*1 - Tendo como entrada a planeta (M = Marte L = Lua) e o peso de uma pessoa, construa um
        programa que calcule e imprima seu peso em Marte ou na Lua, utilizando as seguintes
        Fórmulas:
        Em Marte: (Peso / 9,81 ) * 1,62

        Na Lua: (Peso /
        9,81 ) * 3,71

        2 - Elabore um programa que receba o nome de um produto e o seu valor e imprima o
        nome do produto, valor e o valor com desconto. O desconto é 10%
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Calcular peso em marte e na lua"
                +"\n Insira um peso");
        float peso = in.nextFloat();
        float marte = (float)((peso/ 9.81) * 1.62)  ;
        float lua = (float)((peso /9.81 ) * 3.71); 
        
        System.out.println("o peso é "+ peso
                + "\no peso na lua é "+ marte
                + "\no peso em marte é "+ lua);
        
    }
    
}
