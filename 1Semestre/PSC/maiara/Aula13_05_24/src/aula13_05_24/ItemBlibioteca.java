/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13_05_24;

/**
 *
 * @author micael
 */
class ItemBlibioteca {

    private String titulo;
    private String editora;
    private String idioma;
    private String genero;
    private String dataDePublicacao;
    private boolean disponibilidade;

    public ItemBlibioteca(String titulo, String editora, String idioma,
            String genero, String dataDePublicacao, boolean disponibilidade) {
        this.titulo = titulo;
        this.editora = editora;
        this.idioma = idioma;
        this.genero = genero;
        this.dataDePublicacao = dataDePublicacao;
        this.disponibilidade = disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getIdioma() {
        return editora;
    }

    public String getGenero() {
        return genero;
    }

    public String dataDePublicacao() {
        return dataDePublicacao;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponivel(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}

class Livro extends ItemBlibioteca {

    private String isbm;
    private int numeroDePaginas;

    public Livro(String titulo, String editora, String idioma,
            String genero, String dataDePublicacao, boolean disponibilidade, String isbm, int numeroDePaginas) {
        super(titulo, editora, idioma, genero, dataDePublicacao, disponibilidade);
        this.isbm = isbm;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getnumeroDePaginas() {
        return numeroDePaginas;
    }

    public String getIsbm() {
        return isbm;
    }
}

class Revista extends ItemBlibioteca {

    private String issn;
    private int volume;

    public Revista(String titulo, String editora, String idioma,
            String genero, String dataDePublicacao, boolean disponibilidade, String issn, int volume) {
        super(titulo, editora, idioma, genero, dataDePublicacao, disponibilidade);
        this.issn = issn;
        this.volume = volume;
    }

    public String getIssn() {
        return issn;
    }

    public int getVolume() {
        return volume;
    }
}

class Hq extends ItemBlibioteca {

    private int numeroDeEdicao;
    private int numerosDePaginas;

    public Hq(String titulo, String editora, String idioma,
            String genero, String dataDePublicacao, boolean disponibilidade, int numeroDeEdicao, int numerosDePaginas) {
        super(titulo, editora, idioma, genero, dataDePublicacao, disponibilidade);
        this.numeroDeEdicao = numeroDeEdicao;
        this.numerosDePaginas = numerosDePaginas;
    }

    public int getNumeroDeEdicao() {
        return numeroDeEdicao;
    }

    public int getNumerosDePaginas() {
        return numerosDePaginas;
    }
}
