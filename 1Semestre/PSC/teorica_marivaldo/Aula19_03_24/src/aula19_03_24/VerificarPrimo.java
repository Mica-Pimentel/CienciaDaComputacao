    package aula19_03_24;

    import java.util.Scanner;

    public class VerificarPrimo{
        public static void main(String[] args) {
         // Escreva um programa Java que verifique se um número fornecido pelo usuário é primo ou não.

            Scanner ler = new Scanner(System.in);
            System.out.println("NUMEROS PRIMOS OU NAO\n ISIRA UM NUMERO");
            int num = ler.nextInt();
            if(ehPrimo(num)){
                System.out.println("o numero "+ num+" e primo");
            }else{
                System.out.println("o numero "+ num+" nao e primo");
            }
            


        }
        public static boolean ehPrimo(int num){
            if(num <=1){
                return false;
            }
            for(int i = 2; i  <= Math.sqrt(num);i++){
                if(num % i == 0){
                return false;
                }
            }
        return true;
        }
    }
