package src;

import java.util.Scanner;
import java.io.IOException;

public class _1164 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for (int j = 0; j < N; j++) {
            int X = sc.nextInt();
            for (int i = 1; i < X; i++) {
                if (X % i == 0) {
                    soma += i;
                }
            }
            if (soma == X) {
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }
            soma = 0;
        }
        sc.close();
    }
}