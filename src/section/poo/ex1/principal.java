package section.poo.ex1;

public class principal {
    public static void  main(String[] args) {

        //objeto1
        uzumaki naruto = new uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.shakraInfinito();
        naruto.temBiju = true;
        naruto.ataqueBase();


        //objeto2
        uchiha sasuke = new uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.nivelDeChakra = 99;
        sasuke.sharinganAtivado();
        sasuke.ataqueBase();
    }
}
