package aula30_04_24;

public class Aluno {

    String nome;
    double somaProva = 0;
    int contProva = 0;
    double nota;

    public Aluno(String _nome) {
        nome = _nome;
     
       
    }

    public void setNota(double nota) {
        somaProva = somaProva + nota;
        contProva++;

    }

    public double getMediaGeral() {
        return somaProva / contProva;
    }

}
