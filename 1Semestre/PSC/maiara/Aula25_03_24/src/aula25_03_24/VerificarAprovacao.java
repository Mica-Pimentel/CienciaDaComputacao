package aula25_03_24;

import java.util.Scanner;

public class VerificarAprovacao {
  
   //3.Escreva um programa que determine se um aluno foi aprovado ou reprovado
   //com base em sua nota (considerando a m�dia de aprova��o como 7).

    public static void main(String[] args) {
    System.out.println("Sistema de notas");
    Scanner ler = new Scanner(System.in);
    System.out.println("Digite o seu n�mero de faltas e tecle enter: ");
    float f = ler.nextFloat();
    System.out.println("Digite a sua primeira nota e tecle enter: ");
    float n1 = ler.nextFloat();
    System.out.println("Digite a sua segunda nota e tecle enter: ");
    float n2 = ler.nextFloat();
    System.out.println("Digite a sua terceira nota e tecle enter: ");
    float n3 = ler.nextFloat();
    System.out.println("Digite a sua quarta nota e tecle enter: ");
    float n4 = ler.nextFloat();
    
    float media = (n1+n2+n3+n4)/4;
    
    
    if(media>=7 & f<5) {
        System.out.println("Voce foi aprovado com m�dia: "+ media + " Show papai");
    }
    else {
        System.out.println("vc foi reprovado e isso nao e show"); 
        }
    }
    
}
    


