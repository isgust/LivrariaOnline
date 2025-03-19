import java.util.ArrayList;

public class LojaOnline {
    public static void main(String[] args) {
        // Creating Book objects
        Livro livro1 = new Livro("Dom Quixote", 35.0, "Aventuras de um cavaleiro", "Miguel de Cervantes", "Aventura");
        Livro livro2 = new Livro("1984", 25.0, "Distopia política", "George Orwell", "Ficção Científica");
        Livro livro3 = new Livro("A Arte da Guerra", 150.0, "Estratégias de guerra", "Sun Tzu", "Estratégia");

        // Creating Electronic objects
        Eletronico eletronico1 = new Eletronico("Smartphone", 1200.0, "Celular de última geração", "Samsung", "2023");
        Eletronico eletronico2 = new Eletronico("Notebook", 2500.0, "Laptop para trabalho e jogos", "Dell", "2022");
        Eletronico eletronico3 = new Eletronico("Tablet", 800.0, "Dispositivo para leitura e entretenimento", "Apple", "2023");

        // Creating ArrayList of Products
        ArrayList<Produto> produtos = new ArrayList<>();

        // Adding products to ArrayList
        produtos.add(livro1);
        produtos.add(livro2);
        produtos.add(livro3);
        produtos.add(eletronico1);
        produtos.add(eletronico2);
        produtos.add(eletronico3);

        // Displaying product details
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: R$" + produto.getPreco());
            System.out.println("Descrição: " + produto.getDescricao());

            if (produto instanceof Livro) {
                Livro livro = (Livro) produto;
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Gênero: " + livro.getGenero());
            } else if (produto instanceof Eletronico) {
                Eletronico eletronico = (Eletronico) produto;
                System.out.println("Marca: " + eletronico.getMarca());
                System.out.println("Ano: " + eletronico.getAno());
            }

            System.out.println("Desconto: R$" + produto.calcularDesconto());
            System.out.println("--------------------");
        }
    }
}