package src;

import java.util.Scanner;

public class _2416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int metros = sc.nextInt();
        int comprimento = sc.nextInt();
        while (metros > comprimento)
            metros -= comprimento;
        if (metros == comprimento)
            System.out.println(0);
        else
            System.out.println(metros);

        sc.close();
    }
}
