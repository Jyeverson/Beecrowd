package src;

import java.util.Scanner;

public class _1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int calculo = 1;
        for (int i = 1; i <= N; i++) {
            calculo *= i;
        }
        System.out.println(calculo);
        sc.close();
    }
}