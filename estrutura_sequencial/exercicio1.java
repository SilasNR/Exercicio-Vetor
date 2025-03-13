package estrutura_sequencial;

import java.util.*;

public class exercicio1 {
    public static void main(String[] args) {
        float valorPago, preco, troco;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do produto : ");
        preco = sc.nextFloat();

        System.out.println("Digite o valor de pagamento : ");
        valorPago = sc.nextFloat();

        troco = valorPago - preco;

        if (troco < 0) {
            System.out.println("Valor de pagamento insuficiente !");
        }else {
            System.out.printf("Valor do produto : %.2f\nValor de pagamento : %.2f\nValor do troco : %.2f", preco,valorPago,troco);
        }
    }
}