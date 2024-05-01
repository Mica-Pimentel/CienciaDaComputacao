package aula30_04_24;

public class Aluno {

    private String nome;
    private double somaProva = 0;
    private int contProva = 0;
    private AlunoGraduacao alunoGraduacao;

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

    public AlunoGraduacao getAlunoGraduacao() {
        return alunoGraduacao;
    }

    public  void AlunoGraduacao(String _nome, Aluno aluno) {
        this.alunoGraduacao = alunoGraduacao;
    }

}
