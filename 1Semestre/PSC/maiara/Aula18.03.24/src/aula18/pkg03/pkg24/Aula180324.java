
package aula18.pkg03.pkg24;

import java.util.Scanner;

public class Aula180324 {
    
    public static void main(String[] args) {
     
        /*
        Olá meu nome é <nome> tenho <idade> sou de <cidade> e estou aprendendo a programar com a Profa. Maiara
        */
        
        
        Scanner in = new Scanner(System.in);
         
        System.out.println("digite teu nome:");
        String nome = in.nextLine();
        System.out.println("digite tua idade:");
        String idade = in.nextLine();
        System.out.println("digite tua cidade:");
        String cidade =in.nextLine();
        System.out.println("digite o nome da professora");
        String professora = in.nextLine();
       
        System.out.println( 
        "Olá meu nome e " + nome.toUpperCase() + " tenho " + idade + " sou de " + cidade.toUpperCase() + " e estou aprendendo a programar com a Prof: "+ professora.toUpperCase());
                
        
        
        
    }
    
}
