package src;

import java.util.Scanner;

public class _1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int V = sc.nextInt();
        vetor[0] = V;
        System.out.println("N[0] = " + V);
        int count = V;
        for (int i = 1; i < 10; i++) {
            count *= 2;
            vetor[i] = count;
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
        sc.close();
    }
}