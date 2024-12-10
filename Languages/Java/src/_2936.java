package src;

import java.util.Scanner;

public class _2936 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(((a * 300) + (b * 1500) + (c * 600) + (d * 1000) + (e * 150)) + 225);
        sc.close();
    }
}