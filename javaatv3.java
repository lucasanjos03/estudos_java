class Produto {
    // Atributos (características)
    String nome;
    double preco;
    int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Estoque: " + quantidade + " unidades");
    }

    // Método para simular venda
    public void vender(int qtdVendida) {
        if (qtdVendida <= quantidade) {
            quantidade -= qtdVendida;
            System.out.println("Venda realizada! Restam " + quantidade + " unidades.");
        } else {
            System.out.println("Estoque insuficiente para vender " + qtdVendida + " unidades.");
        }
    }
}
public class javaatv3 {
    public static void main(String[] args) {
        Produto p = new Produto("Mouse Gamer", 150.0, 10);

        p.exibirInfo();              // Mostra info do produto
        p.vender(3);                 // Vende 3 unidades
        p.exibirInfo();              // Mostra novamente o estoque atualizado
        p.vender(8);                 // Tenta vender mais do que tem no estoque
    }
}
