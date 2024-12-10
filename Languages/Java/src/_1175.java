package src;

import java.util.Scanner;

public class _1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[20];
        int vetor1[] = new int[20];

        // dois loops a qual nao me orgulho
        for (int i = 0; i < 20; i++) {
            int local = 19 - i;
            vetor[i] = sc.nextInt();
            vetor1[local] = vetor[i];
        }
        for (int j = 0; j < 20; j++) {
            System.out.println("N[" + j + "] = " + vetor1[j]);
        }

        sc.close();
    }
}
