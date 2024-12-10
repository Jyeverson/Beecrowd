package src;

import java.util.Scanner;

public class _1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");
            }
            if (X == 0 || Y == 0) {
                i = 1;
            }
        }
        sc.close();
    }
}