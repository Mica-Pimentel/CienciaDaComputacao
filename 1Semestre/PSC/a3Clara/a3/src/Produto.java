
public class Produto {

    private int id;
    private String nome;
    private String marca;
    private double custo;
    private double venda;
    private int quantidade;

    public Produto(int id, String nome, String marca, double custo, double venda, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
        this.quantidade = quantidade;
    }

    public Produto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getVenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
