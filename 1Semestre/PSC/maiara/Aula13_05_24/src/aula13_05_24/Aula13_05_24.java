/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13_05_24;

/**
 *
 * @author micael
 */
public class Aula13_05_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Criando alguns itens da biblioteca
        Livro livro1 = new Livro("Harry embusca da rosca queimada", "rosquinha torrada", "Redondel", "redondo", "020223" ,true, "999999", 69 );
        Revista revista1 = new Revista("Harry embusca da chapa quente", "quadrado quente", "pararelepipido", "quadrado", "1010101" ,true, "88888888", 70);

        // Criando alguns usuários
        Aluno aluno1 = new Aluno("Jo?o", "23455", "23434");
        Professor professor1 = new Professor("Maria", "444444", "2424448");

        // Realizando empréstimos
        Emprestimo emprestimo1 = new Emprestimo(aluno1, livro1);
        emprestimo1.emprestarItem();

        Emprestimo emprestimo2 = new Emprestimo(professor1, revista1);
        emprestimo2.emprestarItem();

        // Tentando emprestar um item já emprestado
        Emprestimo emprestimo3 = new Emprestimo(aluno1, livro1);
        emprestimo3.emprestarItem();

        // Devolvendo itens
        emprestimo1.devolverItem();
        emprestimo3.emprestarItem();
    }

}
