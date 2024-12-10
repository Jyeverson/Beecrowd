package src;

import java.util.Scanner;

public class _2454 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int R = sc.nextInt();

        if (P == 0) {
            System.out.println("C");
        } else if (P == 1 && R == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }

        sc.close();
    }
}