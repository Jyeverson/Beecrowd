package src;

import java.util.Scanner;

public class _1013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int maiorAB = (A + B + Math.abs(A - B)) / 2;
        int maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.printf(maiorBC + " eh o maior\n");
        sc.close();
    }
}