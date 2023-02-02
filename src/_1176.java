import java.util.Scanner;

public class _1176 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qTestes = sc.nextInt();
        long fibonacci[] = new long[64];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < 64; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int j = 0; j < qTestes; j++) {
            int indice = sc.nextInt();
            System.out.println("Fib(" + indice + ") = " + fibonacci[indice]);
        }
        sc.close();
    }
}