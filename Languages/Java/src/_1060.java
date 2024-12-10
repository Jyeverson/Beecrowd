package src;

import java.util.Scanner;

public class _1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            Double x = sc.nextDouble();
            if (x > 0)
                cont++;
        }

        System.out.println(cont + " valores positivos");
        sc.close();
    }
}