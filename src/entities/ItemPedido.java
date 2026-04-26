package entities;

public class ItemPedido {

    private Produto produto;
    private int quantidade;
    private String personalizacao;

    public ItemPedido (Produto produto, int quantidade, String personalizacao){
        this.produto = produto;
        this.quantidade = quantidade;
        this.personalizacao = personalizacao;
    }

    public double subTotal(){
       return produto.getPreco() * quantidade;
    }
    public Produto getProduto(){
        return produto ;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPersonalizacao() {
        return personalizacao;
    }

    public void setPersonalizacao(String personalizacao) {
        this.personalizacao = personalizacao;
    }

    @Override
    public String toString(){
        return "ItemPedido{" +
                "Produto = "  + produto +
                ",quantidade = "  + quantidade +
                ",personalizacao =" + personalizacao +
                ", subtotal="+ subTotal() +
                '}';
    }
}

