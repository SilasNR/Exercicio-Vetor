package estrutura_sequencial;

public class exercicio33 {
    public static void main(String[] args) {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };

        int n = a.length;

        int b[] = new int[n];
        String saida = "";

        for (int i = 0; i < n; i++) {
            for (int atual = 0; atual < n; atual++) {
                if (b[atual] != 0) {
                    if (b[atual] > a[i] ) {
                        for(int num = 18; num > 0;num--){
                            b[num +1] = b[num];
                        }
                        b[atual] = a[i];
                        break;
                    }else{
                        
                    }
                } else {
                    b[atual] = a[i];
                    break;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            saida = saida + i + " - " + b[i] + "\n";
        }

        System.out.println(saida);
    }
}
