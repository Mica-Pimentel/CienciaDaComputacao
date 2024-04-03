import java.util.Scanner;
public class Menu {
   




    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int opcao;
        
        System.out.println("Digite uma opção:"
                + "\n1 - Inserir dados: "
                + "\n2 - Visualizar dados:"
                + "\n3 - Sair: ");
        opcao = ler.nextInt();
            
        switch(opcao){
            case 1:
                System.out.println("Insira seus dados: ");
                break;
            
            case 2:
                System.out.println("Visualizando dados...");
                break;
                
            case 3:
                System.out.println("Saindo...");
                break;
                
            default:
                System.out.println("Opção inválida.");
                break;
        }      
    }

}
