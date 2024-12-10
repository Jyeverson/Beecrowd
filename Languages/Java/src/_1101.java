package src;

import java.util.Scanner;

public class _1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;
        int soma = 0;
        while (loop) {
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (M <= 0 || N <= 0) {
                loop = false;
            } else if (M > N) {
                for (int i = N; i <= M; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
                soma = 0;
            } else if (M < N) {
                for (int i = M; i <= N; i++) {
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
                soma = 0;
            }
        }
        sc.close();
    }
}