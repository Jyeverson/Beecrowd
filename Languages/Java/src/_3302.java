package src;

import java.util.Scanner;

public class _3302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int N = sc.nextInt();
            System.out.println("resposta " + i + ": " + N);
        }
        sc.close();
    }
}