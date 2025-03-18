package estrutura_sequencial;

public class exercicio31 {
    public static void main(String[] args) {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };

        int n = a.length;

        int[] b = new int[n];
        int i;
        String saida = "";

        for (i = 0; i < n; i++) {
            if(b[0] < a[i]){
                b[1] = b[0];
                b[0] = a[i];
            }
        }

        saida = "Resposta: " + b[0] + " " + b[1] + "\nFim.";
        System.out.println(saida);

    }
}
