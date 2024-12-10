package src;

import java.util.Scanner;

public class _1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean fim = true;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (fim) {
            int combustivel = sc.nextInt();
            if (combustivel == 1) {
                alcool += 1;
            }
            if (combustivel == 2) {
                gasolina += 1;
            }
            if (combustivel == 3) {
                diesel += 1;
            }
            if (combustivel == 4) {
                fim = false;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
