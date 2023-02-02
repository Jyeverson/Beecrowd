import java.util.Scanner;

public class _1160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int qtdAnos, PA, PB;
        Double G1, G2;
        for (int i = 1; i <= T; i++) {
            qtdAnos = 0;
            PA = sc.nextInt();
            PB = sc.nextInt();
            G1 = sc.nextDouble();
            G2 = sc.nextDouble();
            while (PB >= PA) {
                PA += (PA * G1) / 100;
                PB += (PB * G2) / 100;
                qtdAnos++;
                if (qtdAnos > 100) {
                    break;
                }
            }
            if (qtdAnos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(qtdAnos + " anos.");
            }
        }
        sc.close();
    }
}