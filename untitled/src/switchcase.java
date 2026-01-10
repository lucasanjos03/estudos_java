/*
SWITCH-CASE (seleção por opção)

Quando usar:
- Quando você tem várias opções discretas (1, 2, 3...) e quer executar um bloco para cada valor.

Pontos importantes:
- switch avalia o valor de uma variável (aqui: "opcao").
- case define cada opção possível.
- break encerra o case e evita "fall-through" (cair no próximo case).
- default roda quando nenhuma opção bate (entrada inválida).
*/

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha:");
        System.out.println("1 - Hambúrguer");
        System.out.println("2 - Suco");
        System.out.println("3 - Hambúrguer e Suco");

        int opcao = sc.nextInt(); // Lê a opção digitada pelo usuário

        switch (opcao) {
            case 1:
                System.out.println("Vai custar R$ 15.00");
                break;

            case 2:
                System.out.println("Vai custar R$ 5.00");
                break;

            case 3:
                System.out.println("Vai custar R$ 20.00");
                break;

            default:
                System.out.println("Opção inválida. Digite 1, 2 ou 3.");
        }

        sc.close();
    }
}
