import java.util.Scanner;

public class javaatv1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir");
        System.out.print("Opção: ");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite: ");
                int num1 = teclado.nextInt();
                System.out.print("Digite: ");
                int num2 = teclado.nextInt();
                System.out.println("Resultado: " + (num1+num2));
                break;
            case 2:
                System.out.print("Digite: ");
                int num3 = teclado.nextInt();
                System.out.print("Digite: ");
                int num4 = teclado.nextInt();
                int subt = num3 - num4;
                System.out.println(subt);
                break;
            case 3:
                System.out.print("Digite: ");
                int num5 = teclado.nextInt();
                System.out.print("Digite: ");
                int num6 = teclado.nextInt();
                int mult = num5 * num6;
                System.out.println(mult);
                break;
            case 4:
                System.out.print("Digite: ");
                double num7 = teclado.nextDouble();
                System.out.print("Digite: ");
                double num8 = teclado.nextDouble();
                double divs = num7 / num8;
                System.out.println(divs);
                break;
            default:
                System.out.println("Opção Inválida.");

        }

    }
}
