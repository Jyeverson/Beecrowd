package src;

import java.util.Scanner;

public class _1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int calculo = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            System.out.print(i * i + " ");
            calculo = i * i;
            System.out.println(calculo * i);
            System.out.print(i + " ");
            System.out.print(i * i + 1 + " ");
            System.out.println((calculo * i) + 1);
        }
        sc.close();
    }
}