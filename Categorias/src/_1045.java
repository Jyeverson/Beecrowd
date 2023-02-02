import java.util.Scanner;

public class _1045 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double D;

        if (B > A && B > C) {
            D = A;
            A = B;
            B = D;
        } else if (C > A) {
            D = A;
            A = C;
            C = D;
        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }

        else {
            if (A * A == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (A * A > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (A * A < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
                System.out.println("TRIANGULO ISOSCELES");
        }
        sc.close();
    }
}