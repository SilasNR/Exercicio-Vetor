package estrutura_sequencial;

import java.util.*;

public class exercicio7 {
    public static void main(String[] args) {
        int cod;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o código do produto :");
        cod = sc.nextInt();

        if (cod == 1) {
            System.out.printf("Código %d : Parafuso", cod);
        }else if (cod == 2) {
            System.out.printf("Código %d : Porca", cod);
        }else if (cod == 3) {
            System.out.printf("Código %d : Prego", cod);
        }else{
            System.out.printf("Código %d : Diversos",cod);
        }
    }    
}
