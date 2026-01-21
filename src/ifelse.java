/*
ESTRUTURAS CONDICIONAIS (if / else / else if)
*/

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Que horas são? ");
        int horas = sc.nextInt();

        // Cadeia de decisões: só um bloco será executado
        if (horas < 12) {
            System.out.println("Bom dia!");
        } else if (horas < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close(); // Fecha o Scanner (boa prática)
    }
}
/*
ATRIBUIÇAÕ ACUMULATIVA

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    int minutos = sc.nextInt();
	    double conta = 50.0;

	    if (minutos > 100) {
	        conta += (minutos - 100) * 2.0;
	    }

	    System.out.printf("Valor foi de R$ %.2f%n ", conta);

	    sc.close();

	}
}

EXPRESSÃO CONDICIONAL TERNÁRIA ( ? : )

O que é:
- Uma forma curta de escolher UM VALOR com base em uma condição.
- É uma alternativa ao if/else quando você quer atribuir ou retornar um valor.

Sintaxe:
(condicao) ? valorSeVerdadeiro : valorSeFalso

Exemplos:
int x = 10;
String msg = (x >= 10) ? "OK" : "NÃO OK";

System.out.println((x % 2 == 0) ? "Par" : "Ímpar");
*/