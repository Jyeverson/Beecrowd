package src;

import java.util.Scanner;

public class _1943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicao = sc.nextInt();

        if (posicao == 1)
            System.out.println("Top 1");
        if (posicao > 1 && posicao <= 3)
            System.out.println("Top 3");
        if (posicao > 3 && posicao <= 5)
            System.out.println("Top 5");
        if (posicao > 5 && posicao <= 10)
            System.out.println("Top 10");
        if (posicao > 10 && posicao <= 25)
            System.out.println("Top 25");
        if (posicao > 25 && posicao <= 50)
            System.out.println("Top 50");
        if (posicao > 50 && posicao <= 100)
            System.out.println("Top 100");

        sc.close();
    }
}
