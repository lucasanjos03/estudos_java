package section.poo.ex1;

public class principal {
    public static void  main(String[] args) {

        //objeto1
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        naruto.idade = 14;
        naruto.shakraInfinito();
        naruto.temBiju = true;
        naruto.ataqueBase();


        //objeto2
        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        sasuke.nivelDeChakra = 99;
        sasuke.sharinganAtivado();
        sasuke.ataqueBase();
    }
}
