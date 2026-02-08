package section.poo.ex1;

public class uchiha extends ninja {

    public void sharinganAtivado() {
        //metodo
        System.out.println("Sharingan ativado");
    }

    //@Override
    //public void ataqueBase() {
    //    System.out.println("Joguei uma kunai em você, DE FOGO");
    //}

    @Override
    public void ataqueBase() {
        if (this.nivelDeChakra > 100) {
        System.out.println("Joguei uma kunai em você, DE FOGO");
        } else {
            System.out.println("sem chakra suficiente");
        }
    }
}
