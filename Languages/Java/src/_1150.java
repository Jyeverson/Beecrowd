package src;

import java.util.Scanner;

public class _1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean validacao = true;
        int somas = 0;
        int X = sc.nextInt();
        int x = X;
        int Z = sc.nextInt();
        while (validacao) {
            if (Z <= X) {
                Z = sc.nextInt();
            } else {
                while (validacao) {
                    if (X < Z) {
                        X = X + x + 1;
                        somas += 1;
                    } else {
                        validacao = false;
                    }
                }
            }
        }
        System.out.println(somas);
        sc.close();
    }
}