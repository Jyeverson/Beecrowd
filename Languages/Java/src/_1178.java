package src;

import java.util.Scanner;

public class _1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double X = sc.nextDouble();
        int N[] = new int[100];
        Double divisao = X;
        for (int i = 0; i < 100; i++) {
            System.out.println(String.format("N[" + i + "] = %.4f", divisao));
            divisao = divisao / 2;
        }
        sc.close();
    }
}