package agenda;

public class Contato {

    public Contato(String carlos, String string) {
    }

    private String nome;
    private String numero;

    public void Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + numero;
    }
}
