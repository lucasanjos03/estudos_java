/*
ESTRUTURAS REPETITIVAS — FOR

Quando usar:
- Quando você sabe (ou controla) a quantidade de repetições.

Sintaxe:
for (inicializacao; condicao; incremento) {
    // comandos
}

Pontos importantes:
- inicializacao: executa 1 vez (ex: int i = 0)
- condicao: testada antes de cada repetição
- incremento: executado ao final de cada repetição (ex: i++)
*/

import java.util.Scanner;

public class class_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que você vai somar:");
        int num = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < num; i++) {   // Repete exatamente "num" vezes
            int x = sc.nextInt();         // Lê cada número
            soma += x;                    // Acumula na soma
        }

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
