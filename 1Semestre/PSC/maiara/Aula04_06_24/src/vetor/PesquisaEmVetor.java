package vetor;

import java.util.Scanner;

public class PesquisaEmVetor {

    public static void main(String[] agrs) {
        String[] meses = new String[26];
        Scanner in = new Scanner(System.in);
        meses[0] = "JANEIRO";
        meses[1] = "FEVEREIRO";
        meses[2] = "MAR?O";
        meses[3] = "ABRIL";
        meses[4] = "MAIO";
        meses[5] = "JUNHO";
        meses[6] = "JULHO";
        meses[7] = "AGOSTO";
        meses[8] = "SETEMBRO";
        meses[9] = "OUTUBRO";
        meses[10] = "NOVEMBRO";
        meses[11] = "DEZEMBRO";
        System.out.println("digite o m?s:");
        String mesPesquisar = in.next();
        //busca linear: verifica o vetor ate achar,caso nao cahe  e durante a busca fica exibindo mensagens se achou ou nao
        /*        
        for (int i = 0; i < meses.length; i++) {
            String elemento = meses[i];
            
            if (elemento.equalsIgnoreCase(mesPesquisar)) {
                System.out.println("mes encontrado:");
                break;
            }else {
            System.out.println("mes nao encontrado!");
            }
        }
         */
        // corre?ao da busca, so retorna uma mensagem se sim ou nao

        boolean encontrou = false;
        for (int i = 0; i < meses.length; i++) {
            String elemento = meses[i];
            if (elemento.equalsIgnoreCase(mesPesquisar)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true) {
            System.out.println("mes encontrado!");
        } else {
            System.out.println("mes nao encontrado!");

        }
    }
}
