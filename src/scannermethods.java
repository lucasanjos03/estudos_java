/*
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
public class scannermethods {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);

        String s = "potato apple lemon";
        String[] vect = s.split(" ");

        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}



