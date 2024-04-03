
import java.util.Scanner;

public class ConversorDeMedidas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma opção para conversão: "
                + "\n1 - De quilograma para libra: "
                + "\n2 - De Celsius para Fahreheint: "
                + "\n3 - De metros para pés: ");

        int opcao = ler.nextInt();

        double entrada, saida;

        switch (opcao) {

            case 1:
                System.out.println("Digite o valor em quilograma: ");
                entrada = ler.nextDouble();
                saida = entrada * 2.20462;
                System.out.println("O valor de " + entrada + " em libras é " + saida);
                break;

            case 2:
                System.out.println("Digite o valor em Celsius: ");
                entrada = ler.nextDouble();
                saida = entrada * 1.8 + 32;
                System.out.println("O valor de " + entrada + " graus Celsius em Farenheint é " + saida);
                break;

            case 3:
                System.out.println("Digite o valor em metros: ");
                entrada = ler.nextDouble();
                saida = entrada * 3.28084;
                System.out.println("O valor de " + entrada + " metros em pés é " + saida);
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

}
