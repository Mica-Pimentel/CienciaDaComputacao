package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
   //um programa para conversao de decimal para binario em java
   
        Scanner n = new Scanner(System.in);
        //menu de opções 
        System.out.println("conversor de decimal para binario");
        System.out.println("digite '1'para metodo1  ou digite '2'para o metodo2");
        
        float selecao = n.nextFloat();
       
        if (selecao == 1){
            metodo1();
        }
        if(selecao == 2){
            metodo2();
        }
        
         //System.out.println("deseja converter outro numero?");
         //System.out.println(" se sim digite '3', se nao digite '4'");
         //int decisao=n.nextInt();
         //if (decisao== 3 ){}
        
    }
    

    public static void metodo1() {
        //metodo ultilizando estruturas de repetição
        Scanner n =new Scanner(System.in);
        
        System.out.println("insira o numero a ser convertido:");
        //variaves auxiliares
        int decimal = n.nextInt();
        String binario ="";
       
        
        
        //condição para conversão
        while (decimal >0){
         
          //binario+= "" + decimal%2;//concatena as sobras na string para formar o decimal
          binario =(decimal % 2) + binario;
          decimal = decimal/2;//divisão do numero decimal ate o resultado ser 1ou0
          // por exemplo o decimal 3
          //3/2
          //1 1/2
          //  0 0
          // assim obtendo o resultado final de 1 0 (nao sendo o resultado final)
         // System.out.println(binario);
        }
        //
      String binarioAoContrario =" ";
      for (int i =(binario.length()); i != 0; i--){
      binarioAoContrario+= "" + binario.charAt( i-1);
      }
        
        System.out.println("O resultado em binario é:");
        System.out.println(binarioAoContrario);
        
    }

  
    
    
    public static void metodo2(){
        //metodo ultilizando uma funçao java
        Scanner n = new Scanner(System.in);
        System.out.println("insira o numero a ser convertido:");
        int decimal = n.nextInt();
        String binario = Integer.toBinaryString(decimal);
        System.out.println("O resultado em binario é:");
      System.out.println(binario);
    }

    
    
    
}
    
    

