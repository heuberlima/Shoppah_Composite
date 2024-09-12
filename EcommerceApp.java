public class EcommerceApp {

    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto(1, "Smartphone", "Modelo X", 1500.00, 10);
        Produto produto2 = new Produto(2, "Notebook", "Marca Y", 3000.00, 5);
        Produto produto3 = new Produto(3, "Fones de Ouvido", "Bluetooth", 200.00, 20);

        // Criando um pacote de produtos
        PacoteProduto pacote1 = new PacoteProduto("Pacote de Eletrônicos");
        pacote1.adicionarItem(produto1);
        pacote1.adicionarItem(produto2);

        // Criando um usuário e uma compra
        Usuario usuario1 = new Usuario(101, "Alice", "alice@example.com");
        Compra compra1 = new Compra(1001, usuario1);
        compra1.adicionarItem(pacote1); // Adicionando pacote à compra
        compra1.adicionarItem(produto3); // Adicionando produto simples à compra

        // Exibindo detalhes da compra
        compra1.exibirDetalhes();
    }
}
