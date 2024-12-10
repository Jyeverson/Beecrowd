package src;

import java.util.Scanner;

public class _1168 {
    public static void main(String[] args) {
        int[] leds = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String numero = sc.nextLine();
            int total = 0;
            for (int j = 0; j < numero.length(); j++) {
                int digito = Character.getNumericValue(numero.charAt(j));
                total += leds[digito];
            }
            System.out.println(total + " leds");
        }

        sc.close();
    }
}