import java.util.Scanner;

public class _1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notasV[] = new double[2];
        double nota;
        int count = 0;

        while (count <= 1) {
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                notasV[count++] = nota;
            }
        }
        double media = (notasV[0] + notasV[1]) / 2;
        System.out.println("media = " + String.format("%.2f", media));
        sc.close();
    }

}
