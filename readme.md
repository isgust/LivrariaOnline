# Leitura & Tecnologia: Sistema de Gerenciamento de Livraria Online

**Descrição do Projeto:**

Este projeto consiste em um sistema de gerenciamento para a livraria "Leitura & Tecnologia", que vende livros e eletrônicos online. O sistema foi desenvolvido em Java e utiliza os princípios da Programação Orientada a Objetos (POO), interfaces e `ArrayList` para gerenciar o catálogo de produtos, calcular descontos e registrar vendas.

**Funcionalidades:**

* **Gerenciamento de Produtos:**
    * Adição de livros e eletrônicos ao catálogo.
    * Exibição da lista de produtos disponíveis.
* **Cálculo de Descontos:**
    * Cálculo automático de descontos para livros (10%) e eletrônicos (5%).
    * Cálculo do desconto total no carrinho de compras.
* **Registro de Vendas:**
    * Simulação do registro de vendas de produtos.
* **Carrinho de Compras:**
    * Simulação de um carrinho de compras para testar os descontos e vendas.

**Tecnologias Utilizadas:**

* Java 17 (ou superior).
* Programação Orientada a Objetos (POO).
* Interfaces.
* ArrayList.

**Estrutura do Projeto:**

* `Produto.java`: Classe abstrata que representa um produto genérico.
* `Vendavel.java`: Interface que define o contrato para produtos vendáveis.
* `Livro.java`: Classe que representa um livro, herda de `Produto` e implementa `Vendavel`.
* `Eletronico.java`: Classe que representa um eletrônico, herda de `Produto` e implementa `Vendavel`.
* `LojaOnline.java`: Classe principal que gerencia o catálogo, carrinho e vendas.

**Como Executar o Projeto:**

1.  **Pré-requisitos:**
    * Certifique-se de ter o Java Development Kit (JDK) instalado em seu computador.
    * Ter instalado o Git.
2.  **Clonar o repositório:**
    * `git clone <URL_do_repositório>`
3.  **Compilar o código:**
    * Use seu ambiente de desenvolvimento integrado (IDE) favorito (Eclipse, IntelliJ IDEA, etc.) para compilar e executar o arquivo `LojaOnline.java`.
    * Ou compile usando o terminal, com o comando: `javac LojaOnline.java`
4.  **Executar o programa:**
    * Execute o arquivo `LojaOnline.class` gerado pela compilação.
    * Ou execute usando o terminal, com o comando: `java LojaOnline`

**Contribuição:**

* Sinta-se à vontade para contribuir com este projeto!
* Você pode adicionar novas funcionalidades, corrigir bugs ou melhorar a documentação.
* Para contribuir, siga estes passos:
    1.  Faça um fork do repositório.
    2.  Crie um branch para sua funcionalidade (`git checkout -b feature/NovaFuncionalidade`).
    3.  Faça commit de suas alterações (`git commit -am 'Adiciona nova funcionalidade'`).
    4.  Faça push para o branch (`git push origin feature/NovaFuncionalidade`).
    5.  Abra um pull request.

**Próximos Passos:**

* Implementar uma interface gráfica para o sistema.
* Conectar o sistema a um banco de dados para persistência de dados.
* Adicionar funcionalidades de busca de produtos e gerenciamento de usuários.
* Implementar testes unitários.

**Autor:**

* Gustavo