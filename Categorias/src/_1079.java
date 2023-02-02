import java.util.Scanner;

public class _1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (float i = 0; i < N; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.println(String.format("%.1f", media));
        }
        sc.close();
    }
}