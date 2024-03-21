package aula19_03_24;

  import java.util.Scanner;

public class UmPorcento {


    public static void main(String[] args) {
    System.out.println("Reajuste de Saldo\n");
    Scanner ler = new Scanner (System.in);

    System.out.println("Digite o saldo a ser reajustado e tecle enter:");
    float s = ler.nextFloat();
    float r = (s+(s/100));
    System.out.println(r);
}

}  

