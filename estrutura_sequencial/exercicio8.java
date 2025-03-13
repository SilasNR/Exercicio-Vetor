package estrutura_sequencial;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        int cod;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto :");
        cod = sc.nextInt();

        switch (cod) {
            case 1:
                System.out.printf("Código %d : Parafuso", cod);
                break;
            case 2:
                System.out.printf("Código %d : Porca", cod);
                break;
            case 3:
                System.out.printf("Código %d : Prego", cod);
                break;
            default:
                System.out.printf("Código %d : Diversos", cod);
                break;
        }
    }
}
