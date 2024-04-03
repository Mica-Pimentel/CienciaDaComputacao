
import java.util.Scanner;

public class ConversorDeMedidas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma op��o para convers�o: "
                + "\n1 - De quilograma para libra: "
                + "\n2 - De Celsius para Fahreheint: "
                + "\n3 - De metros para p�s: ");

        int opcao = ler.nextInt();

        double entrada, saida;

        switch (opcao) {

            case 1:
                System.out.println("Digite o valor em quilograma: ");
                entrada = ler.nextDouble();
                saida = entrada * 2.20462;
                System.out.println("O valor de " + entrada + " em libras � " + saida);
                break;

            case 2:
                System.out.println("Digite o valor em Celsius: ");
                entrada = ler.nextDouble();
                saida = entrada * 1.8 + 32;
                System.out.println("O valor de " + entrada + " graus Celsius em Farenheint � " + saida);
                break;

            case 3:
                System.out.println("Digite o valor em metros: ");
                entrada = ler.nextDouble();
                saida = entrada * 3.28084;
                System.out.println("O valor de " + entrada + " metros em p�s � " + saida);
                break;

            default:
                System.out.println("Op��o inv�lida.");
                break;
        }
    }

}
