package vetor;

public class Vetores {

    public static void main(String[] args) {
        //declarando o vetor
        int[] vetor = new int[10];
        //atribuindo os valores para o vetor
        //indice = valor
        vetor[0] = 3;
        vetor[1] = 6;
        vetor[2] = 9;
        vetor[3] = 12;
        vetor[4] = 15;
        vetor[6] = 18;
        vetor[7] = 21;
        vetor[8] = 24;
        vetor[9] = 27;

        //imprimido todo o vetor
        for (int i = 0;  i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}
