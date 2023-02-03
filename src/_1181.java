import java.util.Scanner;

public class _1181 {
    public static void main(String[] args) {
        float M[][] = new float[12][12];
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String T = sc.next();
        float calculo = 0;
        float media = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                float valor = sc.nextFloat();
                M[i][j] = valor;
            }
        }
        if ("s".equals(T.toLowerCase())) {
            for (int l = 0; l < 12; l++) {
                calculo += M[L][l];
            }
            System.out.println(calculo);
        }

        if ("m".equals(T.toLowerCase())) {
            for (int l = 0; l < 12; l++) {
                calculo += M[L][l];
            }
            media = calculo / 12;
            System.out.println(media);
        }
        sc.close();
    }
}