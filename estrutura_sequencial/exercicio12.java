package estrutura_sequencial;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        int[] vet = new int[10];
        int proximo;
        String normal = "", inverso = "";
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o %dº valor :", i+1);
            proximo = sc.nextInt();
            vet[i] = proximo;
            normal = normal +" "+ proximo;
            inverso = proximo +" "+ inverso;
        }
        System.out.printf("Odem inversa : %s\n",inverso);
        System.out.printf("Ordem normal : %s",normal);
    }
}
