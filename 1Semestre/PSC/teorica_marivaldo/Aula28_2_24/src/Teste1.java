
import java.util.Scanner;

public class Teste1 {

    public static void main(String[] args) {

        //FAZER UM PROGRAM PARA LER 4 NOTAS E IMPRIMI-LAS COM UMA MEDIA
        
        System.out.println("Sistemas de NOTAS");
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira a mota 1");
        float nota1 = ler.nextFloat();
        System.out.println("Insira nota 2");
        float nota2 = ler.nextFloat();
        System.out.println("Insira nota 3");
        float nota3 = ler.nextFloat();
        System.out.println("Insira nota 4");
        float nota4 = ler.nextFloat();
       //IMPRESAO DAS NOTAS E MEDIA
       
       System.out.print("NOTAS");
       System.out.println("nota 1:" + nota1);
       System.out.println("nota 2:" + nota2);
       System.out.println("nota 3:" + nota3);
       System.out.println("nota 4:" + nota4);
       System.out.println("MEDIA");
       float media = (nota1+nota2+nota3+nota4)/4;
       System.out.println("Media: " + media);
    
    }
    
}
