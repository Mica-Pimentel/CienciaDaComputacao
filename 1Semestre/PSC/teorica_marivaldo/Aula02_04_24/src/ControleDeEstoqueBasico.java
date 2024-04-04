
import java.util.Scanner;


public class ControleDeEstoqueBasico {

    public static void main(String[] args) {
        // Definindo o estoque inicial
        int estoqueProdutoA = 50;
        int estoqueProdutoB = 30;
        int estoqueProdutoC = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código do produto (A, B ou C): ");
        char codigoProduto = scanner.next().charAt(0);

        System.out.println("Informe a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        // Verificando o código do produto usando switch case
        switch (codigoProduto) {
            case 'A' -> {
                estoqueProdutoA -= quantidadeVendida;
                System.out.println("Quantidade de produto A vendida. Novo estoque: " + estoqueProdutoA);
            }
            case 'B' -> {
                estoqueProdutoB -= quantidadeVendida;
                System.out.println("Quantidade de produto B vendida. Novo estoque: " + estoqueProdutoB);
            }
            case 'C' -> {
                estoqueProdutoC -= quantidadeVendida;
                System.out.println("Quantidade de produto C vendida. Novo estoque: " + estoqueProdutoC);
            }
            default -> System.out.println("Código de produto inválido!");
        }
    }

          
   }

    
