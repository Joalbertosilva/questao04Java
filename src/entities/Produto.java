package entities;

public class Produto {
    private String nome;
    private int estoque;
    private double preco;
    private Categoria categoria;

    public Produto(String nome, int estoque, double preco, Categoria categoria){
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
        this.categoria = categoria;
    }
    public Produto(){

    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", estoque=" + estoque +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
