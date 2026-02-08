package section.poo.ex1;

public class ninja {
    private String nome;
    String aldeia;
    Integer idade;
    Integer nivelDeChakra;

    // Criação do Getter, para mostrar ao usuario.
    public String getNome() {
        return nome;
    }

    // Setter, settar o valor da variavel.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ataqueBase() {
        System.out.println("Joguei uma kunai em você");
    }

}
