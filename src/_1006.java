import java.util.Scanner;

public class _1006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double MEDIA;
        MEDIA = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        sc.close();
    }
}