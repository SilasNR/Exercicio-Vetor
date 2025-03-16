package estrutura_sequencial;

public class exercicio20 {
    public static void main(String[] args) {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };

        int n = a.length;

        int b[] = new int[n];
        String m = "Resposta: ";
        int i;
        String saida = "";
        String indice = "indice: ";

        for (i = 0; i < n - 1; i++) {
            if (a[i] > 50 ) {

                //m = m + " " +a[i];
                indice = indice + " " + i;
            }
        }

        saida = m + "\n" + indice +"\nFim.";
        System.out.println(saida);

    }
}
