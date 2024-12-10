package src;

import java.util.Scanner;

public class _1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int primo = 0;
        for (int i = 1; i <= N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > Y) {
                for (int j = X - 1; j > Y; j--) {
                    if (j % 2 != 0) {
                        primo += j;
                    }
                }
                System.out.println(primo);
                primo = 0;
            } else if (X < Y) {
                for (int j = X + 1; j < Y; j++) {
                    if (j % 2 != 0) {
                        primo += j;
                    }
                }
                System.out.println(primo);
                primo = 0;
            } else {
                primo = 0;
                System.out.println(primo);
            }
        }
        sc.close();
    }
}