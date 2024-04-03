
import java.util.Scanner;

public class CalcularDesconto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Calcular desconto"
                + "\nInsira o valor");
        float valor = in.nextFloat();
        System.out.println("Insira a porcentagem de desconto");
        float porcentagemDeDesconto = in.nextFloat();
        
        float percentual = (float)((porcentagemDeDesconto/100)*valor);
        float precoFinal = valor - percentual;
        System.out.println("O preço final fica : " + precoFinal);
    }
}
