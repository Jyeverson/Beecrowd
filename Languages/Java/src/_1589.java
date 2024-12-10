package src;

import java.io.IOException;
import java.util.Scanner;

public class _1589 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            System.out.println(R1 + R2);
        }
        sc.close();
    }
}