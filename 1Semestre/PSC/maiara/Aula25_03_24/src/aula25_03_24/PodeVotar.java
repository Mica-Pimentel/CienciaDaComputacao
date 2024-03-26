package aula25_03_24;

import java.util.Scanner;

public class PodeVotar {
   //4.Escreva um programa que determine se uma pessoa é elegível para 
    //votar com base em sua idade
    //(considerando 16 anos como idade mínima para votar).
    public static void main(String[] args) {
        System.out.println("Pode votar: \n");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome e tecle enter: ");
        String n = ler.nextLine();
        System.out.println("Digite sua idade e tecle enter:");
        
        int i = ler.nextInt();
        
        if(i >=16){
            System.out.println(n + " tem a idade minima ou superior para votar");
        }else{
            System.out.println(n + " não tem a idade minima ou superior para votar");
        }
        
    }
    
}

