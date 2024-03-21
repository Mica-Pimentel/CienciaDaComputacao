package aula19_03_24;
  
import java.util.Scanner;

public class MaiorIdade {

    public static void main(String[] args) {
        System.out.println("detector de maioridade: \n");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome e tecle enter: ");
        String n = ler.next();
        System.out.println("Digite sua idade e tecle enter:");
        int i = ler.nextInt();
        if(i>=18){System.out.println(n + " é maior de idade.");
        }else { System.out.println(n + " é menor de idade.");
        }
        
    }
    

}
