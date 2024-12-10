package src;

import java.util.Scanner;

public class _1963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A = sc.nextDouble();
        Double B = sc.nextDouble();

        Double porcentagem = ((B - A) / A) * 100;

        String numeroFormatado = String.format("%.2f", porcentagem);

        System.out.println(numeroFormatado + "%");

        sc.close();
    }
}
