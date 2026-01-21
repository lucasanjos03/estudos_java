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
/*
CASTING em Java (conversão de tipos)

1) WIDENING (implícito): menor -> maior (seguro)
   int a = 10;
   double b = a;      // 10.0

2) NARROWING (explícito): maior -> menor (pode perder info)
   double x = 9.99;
   int y = (int) x;   // 9 (corta, não arredonda)

3) Evitar divisão inteira
   int p = 5, q = 2;
   double r1 = p / q;          // 2.0 (inteira primeiro)
   double r2 = (double) p / q; // 2.5

4) char <-> int (Unicode)
   char c = 'A';
   int code = (int) c;  // 65
   char d = (char) 66;  // 'B'

5) Herança: upcasting / downcasting
   Animal a1 = new Dog();      // upcasting (automático)
   if (a1 instanceof Dog) {
       Dog dog = (Dog) a1;     // downcasting (com cast)
       dog.bark();
   }
*/
