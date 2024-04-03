
import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {

        System.out.println("Sistema de dias");
        Scanner in = new Scanner(System.in);
        int dia = in.nextInt();
        String diaSemana;
        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                diaSemana = "invalido";
                break;
        }
        
        System.out.println("O dia é "+diaSemana);
    }
}
