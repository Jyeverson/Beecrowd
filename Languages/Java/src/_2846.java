package src;

import java.util.Scanner;

public class _2846 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int fibonot = getKthFibonot(k);
        System.out.println(fibonot);
        sc.close();
    }

    public static int getKthFibonot(int k) {
        int prev1 = 1;
        int prev2 = 1;
        int fibonot = 0;

        while (k > 0) {
            fibonot = prev1 + 1; // O primeiro número não pertencente à sequência de Fibonacci é sempre 2
            while (isFibonacci(fibonot)) {
                fibonot++; // Enquanto o número gerado for um número de Fibonacci, incrementa para obter o próximo não-Fibonacci
            }

            prev1 = fibonot;
            prev2 = prev1;
            k--;
        }

        return fibonot;
    }

    public static boolean isFibonacci(int num) {
        // Verifica se um número é um número de Fibonacci
        int a = 0;
        int b = 1;

        while (b < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == num;
    }
}