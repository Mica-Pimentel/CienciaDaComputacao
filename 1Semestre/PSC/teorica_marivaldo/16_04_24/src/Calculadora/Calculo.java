package Calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculo {

    public static void main(String args[]) {
        Calculo c = new Calculo();
        System.out.println("" + c.calculadora("5/5"));
    }

    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<Double>();
        List<Character> listaOperadores = new ArrayList<Character>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);
        resultado = calcularValor(listaNumeros, listaOperadores);
        return resultado;
    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        String resultado = "";
        double total = 0.0;
        int j = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (total == 0.0) {
                double numero1 = listaNumeros.get(i).doubleValue();
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(numero1, operador, numero2);
            } else if (total > 0.0) {
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(i).charValue();
                total = executarOperacao(total, operador, numero2);
                j++;
            }
        }

        resultado = "" + total;
        return resultado;

    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;
        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == '%') {
            resultado = (numero2 * 100) / numero1;
        }
        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {
        List<Double> listaNumeros = new ArrayList<Double>();
        String numeroEmString = "";
        for (int i = 0; 1 <= expressao.length(); i++) {
            if (isOperadores(expressao.charAt(i))) {
                double numero = Double.valueOf(numeroEmString);
                listaNumeros.add(numero);
                numeroEmString = "";
            } else {
                numeroEmString = numeroEmString.concat("" + expressao.charAt(i));
            }
        }
        if (!numeroEmString.isEmpty()) {
            Double numero = Double.valueOf(numeroEmString);
            listaNumeros.add(numero);
        }

        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {
        List<Character> listaOperadores = new ArrayList<Character>();

        for (int i = 0; i < expressao.length(); i++) {
            if (isOperadores(expressao.charAt(i))) {
                listaOperadores.add(//Character
                        expressao.charAt(i));
            }
        }
        return listaOperadores;
    }

    private boolean isOperadores(char caractere) {
        boolean isOperador = false;
        if (caractere == '-' || caractere == '+' || caractere == '*' || caractere == '/' || caractere == '%') {
            isOperador = true;
        }
        return isOperador;
    }

}
