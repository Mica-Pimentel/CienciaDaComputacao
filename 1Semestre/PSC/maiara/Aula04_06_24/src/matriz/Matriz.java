/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author micael
 */
public class Matriz {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // buscando o elementro da matriz
        Scanner in = new Scanner(System.in);
        System.out.println("digite a linha da matriz");
        int linha = in.nextInt();
        System.out.println("digite a coluna da matriz");
        int coluna = in.nextInt();

        int saida = matriz[linha][coluna];
        System.out.println(saida);
    }
}
