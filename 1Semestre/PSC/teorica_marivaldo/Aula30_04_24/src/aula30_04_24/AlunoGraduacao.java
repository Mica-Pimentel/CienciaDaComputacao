/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula30_04_24;


/**
 *
 * @author 722414878
 */
public class AlunoGraduacao extends Aluno {
    private double somaExercicio = 0;
    private int contExercicio = 0;

    public AlunoGraduacao(String _nome, Aluno aluno) {
        super(_nome);
   
        
    }

    public void setNotasExercicio(double nota) {
        somaExercicio += somaExercicio + nota;
        contExercicio++;
    }
    
    public double getMediaGeral(){
    double mediaExercicio=somaExercicio/contExercicio;
    return mediaExercicio;
    }
}
