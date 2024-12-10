package src;

import java.util.Scanner;

public class _1930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int T3 = sc.nextInt();
        int T4 = sc.nextInt();

        System.out.println((T1 + (T2 - 1) + (T3 - 1) + (T4 - 1)));

        sc.close();
    }
}