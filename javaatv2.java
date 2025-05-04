import java.util.Scanner;

public class javaatv2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== CALCULADORA ====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            int a, b;
            double x, y;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    a = teclado.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = teclado.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    a = teclado.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = teclado.nextInt();
                    System.out.println("Resultado: " + (a - b));
                    break;

                case 3:
                    System.out.print("Digite o primeiro número: ");
                    a = teclado.nextInt();
                    System.out.print("Digite o segundo número: ");
                    b = teclado.nextInt();
                    System.out.println("Resultado: " + (a * b));
                    break;

                case 4:
                    System.out.print("Digite o dividendo: ");
                    x = teclado.nextDouble();
                    System.out.print("Digite o divisor: ");
                    y = teclado.nextDouble();
                    if (y != 0) {
                        System.out.println("Resultado: " + (x / y));
                    } else {
                        System.out.println("Erro: divisão por zero.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        teclado.close();
    }
}
