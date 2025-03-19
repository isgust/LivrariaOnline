public class Eletronico extends Produto implements Vendavel{
    //Atributes
    private String marca;
    private String ano;

    //Constructor
    public Eletronico(String nome, double preco, String descricao, String marca, String ano){
        super(nome, preco, descricao);
        this.marca = marca;
        this.ano = ano;
    }
    //Implements from Vendavel Interface
    @Override
    public void vender(){
        System.out.println("Livro vendido");
    }

    //Method from Abstract Class Produto
    @Override
    public double calcularDesconto() {
        if(getPreco()>=3000.0){
            return getPreco() * 0.15;
        }else if(getPreco() >= 2000.0){
            return getPreco() * 0.1;
        }else {
            return getPreco();
        }
    }

    //Getters e Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getAno(){
        return ano;
    }
    public void setAno(String ano){
        this.ano = ano;
    }

}
