package aula25_03_24;

import java.util.Scanner;

public class NumeroDivisivel6e9 {
  //5.**Determinar se um número é divisível por 6 e 9:**
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
     System.out.println(" insira um numero para ver se é divisivel por 6 e 9");
     int num = in.nextInt();
     
     if(num % 6 == 0 && num % 9 == 0){
         System.out.println("numero é divisivel");
     }else{
         System.out.println("numero não é divisivel");
     }
    
}

}