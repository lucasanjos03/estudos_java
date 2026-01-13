/*
ESTRUTURAS REPETITIVAS — WHILE

Quando usar:
- Quando você NÃO sabe exatamente quantas repetições serão necessárias.
- O loop continua enquanto a condição for verdadeira.

Pontos importantes:
- A condição é verificada ANTES de cada repetição.
- Se a condição já começar falsa, o bloco pode nem executar.


import java.util.Scanner;

public class while_dowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (o loop para quando for >= 10): ");
        int num = sc.nextInt();

        while (num < 10) {                // Repete enquanto num for menor que 10
            System.out.println("Limite não atingido. Digite novamente:");
            num = sc.nextInt();           // Atualiza o valor para a próxima verificação
        }

        System.out.println("Ok. Limite atingido (>= 10).");

        sc.close();
    }
}
*/

import java.util.Scanner;

public class while_dowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char resposta;
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", F);
            System.out.print("Deseja continuar? (s/n)");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

        sc.close();

    }
}