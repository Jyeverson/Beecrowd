package src;

import java.util.Scanner;

public class _1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int entrada = sc.nextInt();
            if (entrada <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = entrada;
            }
            System.out.println("X[" + i + "] = " + vetor[i]);
        }
        sc.close();
    }
}
