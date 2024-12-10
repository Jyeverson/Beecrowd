package src;

import java.util.Scanner;

public class _1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vInter = 0;
        int vGremio = 0;
        int empates = 0;
        int grenais = 1;
        int grenal = 1;
        while (grenal == 1) {
            int inter = sc.nextInt();
            int gremio = sc.nextInt();
            if (inter > gremio) {
                vInter += 1;
            } else if (gremio > inter) {
                vGremio += 1;
            } else {
                empates += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int novoGrenal = sc.nextInt();
            if (novoGrenal == 1) {
                grenal = 1;
                grenais += 1;
            } else if (novoGrenal == 2) {
                grenal = 2;
            }
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vInter);
        System.out.println("Gremio:" + vGremio);
        System.out.println("Empates:" + empates);
        if (vInter > vGremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
        sc.close();
    }
}