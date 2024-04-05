package Parte2;

import java.util.Scanner;

public class CustoDoCarro {

    /*
    O custo de um carro novo ao consumidor � a soma do custo de f�brica com a
    porcentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
    escrever um algoritmo para ler o custo de f�brica de um carro, calcular e 
    escrever o custo final ao consumidor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculador de custos para repasse ao cliente"
                + "\nInsira o custo de produ�ao da fabrica:");

        float custoDeFabrica = in.nextFloat();

        float percentualDistribuidor = ((28f / 100) * custoDeFabrica);
        float percentualImpostos = ((45f / 100) * custoDeFabrica);
        float repasseConsumidor = custoDeFabrica + percentualDistribuidor + percentualImpostos;
        System.out.println("O valor de repasse ao cliente �:" + repasseConsumidor);

    }
}
