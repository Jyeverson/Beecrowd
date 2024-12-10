package src;

import java.util.Scanner;

public class _1865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            String nome = sc.next();
            int N = sc.nextInt();
            if (nome.equalsIgnoreCase("thor"))
                System.out.println("Y");
            else {
                System.out.println("N");
            }
        }
        sc.close();
    }
}
