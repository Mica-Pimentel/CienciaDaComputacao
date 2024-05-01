package aula30_04_24;



public class MainAluno {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao");

        aluno1.setNota(9);
        aluno1.setNota(7);
        aluno1.setNota(5);
        
        AlunoGraduacao alunoGraduacao1 = new AlunoGraduacao("Joao", aluno1);
        alunoGraduacao1.setNotasExercicio(3);
        alunoGraduacao1.setNotasExercicio(4);
        alunoGraduacao1.setNotasExercicio(10);

        System.out.println("Aluno1 " + aluno1.getMediaGeral());
        System.out.println("Média geral do aluno de graduação: "
                + aluno1.getAlunoGraduacao().getMediaGeral());
    }
}
