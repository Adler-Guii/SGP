package entities;

public class Produto  {

    private String nome;
    private double preco;
    private double custo;

    public Produto (String nome, double preco, double custo ){
        this.nome = nome;
        this.preco = preco;
        this.custo = custo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(){
        this.preco = preco;
    }
    public double getCusto(){
        return custo;
    }
    public void setCusto(){
        this.custo = custo;
    }
    @Override
    public String toString(){
        return  "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", custo=" + custo +
                '}';
    }
}

