package estrutura_sequencial;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        float lado1, lado2, lado3, result;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado : ");
        lado1 = sc.nextFloat();

        System.out.println("Digite o valor do segundo lado : ");
        lado2 = sc.nextFloat();

        System.out.println("Digite o valor do terceiro lado : ");
        lado3 = sc.nextFloat();

        if (lado1 <= (lado2 + lado3) && lado2 <= (lado1 + lado3) && lado3 <= (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.printf("Este é um triangulo equilátero ! (três lados iguais)\nlado 1 : %.0f\nlado 2 : %.0f\nlado 3 : %.0f", lado1, lado2, lado3);
            }else if ( lado1 == lado3 || lado1 == lado2 || lado2 == lado3) {
                System.out.printf("Este é um triangulo isosceles ! (dois lados iguais)\nlado 1 : %.0f\nlado 2 : %.0f\nlado 3 : %.0f", lado1, lado2, lado3);
            }else{
                System.out.printf("Este é um triangulo escaleno ! (três lados diferentes)\nlado 1 : %.0f\nlado 2 : %.0f\nlado 3 : %.0f", lado1, lado2, lado3);
            }        
        }else{
            System.out.println("0 Os lados não podem ser menores ou iguais a 0");
        }
    }
}
