public class Livro extends Produto implements Vendavel {
    private String autor;
    private String genero;

    //Constructor
    public Livro(String nome, double preco, String descricao, String autor, String genero){
        super(nome, preco, descricao);
        this.autor = autor;
        this.genero = genero;
    }

    //Implements from Vendavel Interface
    @Override
    public void vender(){
        System.out.println("Livro vendido");
    }

    //Method from Abstract Class Produto
    @Override
    public double calcularDesconto() {
        if(getPreco()>=100.0){
            return getPreco() * 0.15;
        }else {
            return getPreco();
        }
    }

    //Getters e Setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
}
