import java.util.Scanner;

public class scannermethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // next() lê o próximo "token" (até espaço/enter).
        // charAt(0) pega o 1º caractere desse token.
        char w = sc.next().charAt(0); // Lê apenas o primeiro caractere digitado (do próximo token)

        int y = sc.nextInt();         // Lê um inteiro (ex: 10)
        double z = sc.nextDouble();   // Lê um double (ex: 2.5)
        String x = sc.next();         // Lê uma palavra (token) (ex: "Pedro")

        System.out.println("VOCÊ DIGITOU: " + w);
        System.out.println("VOCÊ DIGITOU: " + y);
        System.out.println("VOCÊ DIGITOU: " + z);
        System.out.println("VOCÊ DIGITOU: " + x);

        sc.close(); // Fecha o Scanner (boa prática: libera o recurso de entrada)
    }
}

/*
========================================
Ler texto (linha inteira) com nextLine()
========================================

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // next() lê apenas uma palavra (token), parando em espaço/enter.
        // nextLine() lê a linha inteira, incluindo espaços, até o ENTER.
        String x = sc.nextLine();
        String y = sc.nextLine();
        String z = sc.nextLine();

        System.out.println("VOCÊ DIGITOU: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}

========================================
"Quebra de linha pendente" (buffer)
========================================
Quando você usa nextInt()/nextDouble()/next() e depois chama nextLine(),
o nextLine() pode ler apenas o ENTER que ficou no buffer.

Solução: consumir a quebra de linha com sc.nextLine() antes de ler a próxima linha.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int wap = sc.nextInt();

        sc.nextLine(); // Consome o ENTER pendente após o nextInt()

        String x = sc.nextLine(); // Agora lê a linha corretamente
        String y = sc.nextLine();
        String z = sc.nextLine();

        System.out.println("VOCÊ DIGITOU: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(wap);

        sc.close();
    }
}
*/
