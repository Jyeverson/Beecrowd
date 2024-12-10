package src;

import java.util.Scanner;

public class _1866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {
            int N = sc.nextInt();
            if (N % 2 != 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}