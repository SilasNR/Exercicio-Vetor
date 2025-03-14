package estrutura_sequencial;

import java.util.*;

public class exercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int somaTotal = 0, media;
        String abaixosMedia = "";

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 50; i++){
            System.out.printf("Digite o %dº numero : ",i+1);
            numeros[i] = sc.nextInt();
            somaTotal = somaTotal + numeros[i];
        }

        media = somaTotal / numeros.length;

        for(int i = 0; i < 50; i++){
            if(numeros[i] < media){
                abaixosMedia = abaixosMedia + " " + numeros[i];
            }
        }

        System.out.printf("A soma de todos os números : %d\nMédia dos valores : %d\nValores abaixo da média : %s",somaTotal, media, abaixosMedia );
    }
}
