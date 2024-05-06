package agenda;

public class Contato {

    public Contato(String nome_, int numero1) {
    }

    private String nome;
    private int numero;

    public void Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

}
