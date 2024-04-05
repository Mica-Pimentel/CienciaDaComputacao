/*
  - Escrever um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine
e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam 
para a meia-noite.
 */
package Parte2;

import java.util.Scanner;

public class HoraMinutoSegundo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Sistema de conversao para segundos\n conversor de horas para segundos");
        System.out.println("Insira a Hora");
        byte hora = in.nextByte();
        System.out.println("Insira os minutos");
        byte minutos = in.nextByte();
        System.out.println("Insira os segundos");
        byte segundos = in.nextByte();
        segundosTotal(hora, minutos, segundos);

    }

    public static void segundosTotal(byte hora, byte minutos, byte segundos) {
        if (hora >= 0 && hora <= 24 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            int horaSegundos = (hora * 60) * 60;
            int minutosSegundos = segundos * 60;
            int segundosTotais = horaSegundos + minutosSegundos + segundos;
            System.out.println("Os segundos total são: " + segundosTotais);
            passouDe00(segundosTotais);
            faltaAte24(segundosTotais);
        } else {
            System.out.println("Hora invalida");
        }

    }

    public static void passouDe00(int segundos) {

        System.out.println("ja se passaram de meia noite: " + segundos + " segundos desde da meia noite");

    }

    public static void faltaAte24(int segundos) {

        int i = 86400 - segundos;
        System.out.println("Faltam ate a meia noite: " + i + " segundos");

    }
}
