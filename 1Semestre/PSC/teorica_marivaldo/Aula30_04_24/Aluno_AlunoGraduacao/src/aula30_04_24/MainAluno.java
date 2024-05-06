package aula30_04_24;

public class MainAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");
        aluno1.setNota(7);
        aluno1.setNota(9);
        aluno1.setNota(8);

        AlunoGraduacao alunoGraduacao1 = new AlunoGraduacao("Maria");
        alunoGraduacao1.setNota(9);
        alunoGraduacao1.setNota(7.8);
        alunoGraduacao1.setNota(9.7);
        alunoGraduacao1.setNotasExercicio(2.6);
        alunoGraduacao1.setNotasExercicio(5.4);
        alunoGraduacao1.setNotasExercicio(7.2);

        System.out.println("Aluno comum "+aluno1.nome+" " + aluno1.getMediaGeral());
        System.out.println("Média geral do aluno de graduação: "+alunoGraduacao1.nome+" "+alunoGraduacao1.getMediaGeral());
    }
}
