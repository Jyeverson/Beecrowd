package src;

import java.util.Scanner;

public class _1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int primos = 0;
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int l = x; primos < y; l++) {
                if (l % 2 != 0) {
                    soma += l;
                    primos += 1;
                }
            }
            System.out.println(soma);
            soma = 0;
            primos = 0;
        }
        sc.close();
    }
}
