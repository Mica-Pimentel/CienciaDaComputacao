package crud_a3_psc;
//classe de modelagem do objeto produto

public class Produtos {

    private int id_prod;
    private String nome;
    private String marca;
    private double custo;
    private double venda;
    private int quantidade;

    public Produtos(int id_prod, String nome, String marca, double custo, double venda, int quantidade) {
        this.id_prod = id_prod;
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
        this.quantidade = quantidade;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
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

    public void getMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void getCusto(double custo) {
        this.custo = custo;
    }

    public double getvenda() {
        return venda;
    }

    public void setVenda(double venda) {
        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQauntidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
