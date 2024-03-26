package aula25_03_24;

import java.util.Scanner;

public class IdadeeAltura {
    //7.Verificar se uma pessoa é adolescente (entre 13 e 19 anos) 
    //e tem altura superior a 1,60 metros:**
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Verificar idade e altura");
        System.out.println("Insira a idade:");
        int age = in.nextInt();
        System.out.println("Isira a altura");
        float height = in.nextFloat();
        
        if(age >= 13 && age <=19 && height >= 1.60){
            System.out.println("A pessoa é adolecente e tem a altura superior a 1,60");
        }else{
            System.out.println("A pessoa nao é adolecente ou nao tem a altura superior a 1,60");
        }
    }
}
