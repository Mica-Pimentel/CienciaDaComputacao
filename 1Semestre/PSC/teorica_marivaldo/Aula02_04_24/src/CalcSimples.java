import java.util.Scanner;

public class CalcSimples {
   
    public static void main(String[] args) {
        System.out.println(
                    "calculadora simples"
                    +"\ndigite 1 para soma"
                    +"\ndigite 2 para subtração"
                    +"\ndigite 3 para multiplicação"
                    +"\ndigite 4 para divisão");
        Scanner in = new Scanner(System.in);
        int seletor= in.nextInt();
        String operacao;
                
        
        switch(seletor){
            case 1: operacao = "4+5= " + (4+5);
            break;
            case 2: operacao = "5-4= " + (5-4);
            break;
            case 3: operacao = "4+5= " + (5*4);
            break;
            case 4: operacao = "4+5= " + (5/4);
            break;
            default: operacao ="invalido";
            break;
            
        }
        System.out.println("A operação realizada foi: " + operacao);
    }
}
