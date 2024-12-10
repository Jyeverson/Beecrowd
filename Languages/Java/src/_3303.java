package src;

import java.util.Scanner;

public class _3303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String teste = sc.nextLine();
        if (teste.length() >= 10) {
            System.out.println("palavrao");
        } else {
            System.out.println("palavrinha");
        }
        sc.close();
    }
}