package src;

import java.util.Scanner;

public class _1151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int depois, antes = 0, agora = 1;
        for (int i = 1; i <= x; i++) {
            if (i == x)
                System.out.println(antes);
            else
                System.out.print(antes + " ");
            depois = antes + agora;
            antes = agora;
            agora = depois;
        }
        sc.close();
    }
}