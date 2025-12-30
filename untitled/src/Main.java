public class Main
{
    public static void main(String[] args) {
        String product1 = "computador";
        String product2 = "Mesa de escritorio";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("Computador, está custando $ %.2f%n", price1);
        System.out.printf("Mesa de escritorio, está custando $ %.2f%n", price2);

        System.out.printf("Record: idade de %d, código %d e genero é: %c%n", age, code, gender);

        System.out.printf("Medida com oito casas decimais: %.8f%n", measure);
        System.out.printf("Arredondando, com três casas decimais: %.3f%n", measure);
        //string S, int D, double f, char c
    }
}