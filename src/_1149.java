import java.util.Scanner;

public class _1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int soma = 0;
        while (N <= 0) {
            N = sc.nextInt();
        }
        for (int i = 0; i <= N - 1; i++) {
            soma += A + i;
        }
        System.out.println(soma);
        sc.close();
    }
}
