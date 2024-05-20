/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13_05_24;

/**
 *
 * @author micael
 */
class Usuario {

    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public boolean validarLogin(String _nome, String _senha) {
        if (_nome.equals(this.nome) && _senha.equals(this.senha)) {
            return true;
        } else {
            return false;
        }
    }

}

class Aluno extends Usuario {

    private String dataDeNascimento;

    public Aluno(String nome, String senha, String dataDeNascimento) {
        super(nome, senha);
        this.dataDeNascimento = dataDeNascimento;
    }
}

class Professor extends Usuario {

    private String dataDeNascimento;

    public Professor(String nome, String senha, String dataDeNascimento) {
        super(nome, senha);
        this.dataDeNascimento = dataDeNascimento;
    }
}
