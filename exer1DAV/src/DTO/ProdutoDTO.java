package DTO;

public class ProdutoDTO {
    private String nome;
    private double preco;
    private int quantidade;

 
    public ProdutoDTO() {
        
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$ " + preco + " | Quantidade: " + quantidade;
    }
}
