package src;

import java.util.Scanner;

public class _1052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("January");
        } else if (numero == 2) {
            System.out.println("February");
        } else if (numero == 3) {
            System.out.println("March");
        } else if (numero == 4) {
            System.out.println("April");
        } else if (numero == 5) {
            System.out.println("May");
        } else if (numero == 6) {
            System.out.println("June");
        } else if (numero == 7) {
            System.out.println("July");
        } else if (numero == 8) {
            System.out.println("August");
        } else if (numero == 9) {
            System.out.println("September");
        } else if (numero == 10) {
            System.out.println("October");
        } else if (numero == 11) {
            System.out.println("November");
        } else if (numero == 12) {
            System.out.println("December");
        }

        sc.close();
    }

}