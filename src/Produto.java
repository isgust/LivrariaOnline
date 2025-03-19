abstract class Produto {
    private String nome;
    private double preco;
    private String descricao;

    //Constructor
    public Produto(String nome, double preco, String descricao){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        if(preco>= 0) {
            this.preco = preco;
        }else{
            System.out.println("Preço invalido");
        }
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    //Abstract Method
    public abstract double calcularDesconto();

}
