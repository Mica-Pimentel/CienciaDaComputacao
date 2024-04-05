package Parte2;

import java.util.Scanner;

public class CustoDoCarro {

    /*
    O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
    porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
    escrever um algoritmo para ler o custo de fábrica de um carro, calcular e 
    escrever o custo final ao consumidor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calculador de custos para repasse ao cliente"
                + "\nInsira o custo de produçao da fabrica:");

        float custoDeFabrica = in.nextFloat();

        float percentualDistribuidor = ((28f / 100) * custoDeFabrica);
        float percentualImpostos = ((45f / 100) * custoDeFabrica);
        float repasseConsumidor = custoDeFabrica + percentualDistribuidor + percentualImpostos;
        System.out.println("O valor de repasse ao cliente é:" + repasseConsumidor);

    }
}
