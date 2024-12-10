package src;

import java.io.IOException;
import java.util.Scanner;

public class _2344 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("E");
        } else if (N >= 1 && N <= 35) {
            System.out.println("D");
        } else if (N >= 36 && N <= 60) {
            System.out.println("C");
        } else if (N >= 61 && N <= 85) {
            System.out.println("B");
        } else if (N >= 86 && N <= 100) {
            System.out.println("A");
        }

        sc.close();
    }

}