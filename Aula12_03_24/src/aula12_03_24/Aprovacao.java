package aula12_03_24;

import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
    /* fazer um programa para ler o nome do aluno
        ler 4 notas calcular a media
        imprimir o nome do aluno, media e situaçao(aprovado ou reprovado)
        obss: media >=7
              falta<=5
        */
        Scanner ler = new Scanner(System.in);
        System.out.println("Sistema de gestao para aprovacao");
        System.out.println("insira o nome do aluno ");
        String nome = ler.nextLine();
        System.out.println("insira a primeira nota");
        float nota1 = ler.nextFloat();
        System.out.println("insira a segunda nota");
        float nota2 = ler.nextFloat();
        System.out.println("insira a terceira nota");
        float nota3 = ler.nextFloat();
        System.out.println("insira a quarta nota");
        float nota4 = ler.nextFloat();
        System.out.println("insira as faltas do aluno");
        int faltas = ler.nextInt();
        
        float media =(nota1+nota2+nota3+nota4)/4;
        
    
        
        
        
    }
    
    
    
}
