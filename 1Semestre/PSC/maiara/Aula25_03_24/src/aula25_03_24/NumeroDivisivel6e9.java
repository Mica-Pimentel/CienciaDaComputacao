package aula25_03_24;

import java.util.Scanner;

public class NumeroDivisivel6e9 {
  //5.**Determinar se um n�mero � divis�vel por 6 e 9:**
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
     System.out.println(" insira um numero para ver se � divisivel por 6 e 9");
     int num = in.nextInt();
     
     if(num % 6 == 0 && num % 9 == 0){
         System.out.println("numero � divisivel");
     }else{
         System.out.println("numero n�o � divisivel");
     }
    
}

}