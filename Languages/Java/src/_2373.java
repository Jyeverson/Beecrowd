package src;

import java.util.Scanner;

public class _2373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nBandeja = sc.nextInt();
        int coposQ = 0;
        for (int i = 0; i < nBandeja; i++) {
            int latas = sc.nextInt();
            int copos = sc.nextInt();
            if (latas > copos) {
                coposQ += copos;
            }
        }
        System.out.println(coposQ);
        sc.close();
    }
}
