package src;

import java.util.Scanner;

public class _1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double MEDIA;
        MEDIA = (nota1 * 3.5 + nota2 * 7.5) / 11;

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        sc.close();
    }
}