package src;

import java.util.Scanner;

public class _1174 {
    public static void main(String[] args) {
        Double vetor[] = new Double[100];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            vetor[i] = sc.nextDouble();
            if (vetor[i] <= 10) {
                System.out.println("A[" + i + "]" + " = " + vetor[i]);
            }
        }
        sc.close();
    }
}