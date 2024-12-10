package src;

import java.io.IOException;
import java.util.Scanner;

public class _1071 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X < Y) {
            for (int i = X + 1; i < Y; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = Y + 1; i < X; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
