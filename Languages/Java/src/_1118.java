package src;

import java.util.Scanner;

public class _1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, count = 1;
        while (count == 1) {

            n1 = sc.nextDouble();
            while (n1 > 10 || n1 < 0) {
                System.out.println("nota invalida");
                n1 = sc.nextDouble();
            }

            n2 = sc.nextDouble();
            while (n2 > 10 || n2 < 0) {
                System.out.println("nota invalida");
                n2 = sc.nextDouble();
            }

            double media = (n1 + n2) / 2;
            System.out.println(String.format("media = %.2f", media));

            System.out.println("novo calculo (1-sim 2-nao)");
            count = sc.nextInt();
            while (count != 1 && count != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                count = sc.nextInt();
            }
        }
        sc.close();
    }
}