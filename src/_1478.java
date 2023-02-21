import java.util.Scanner;

public class _1478 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x;
        while (N != 0) {
            for (int i = 1; i <= N; i++) {
                x = i;
                for (int j = 1; j <= N; j++) {
                    if (i == j)
                        x = 1;

                    System.out.printf("%3d", x);
                    if (j < N)
                        System.out.print(" ");
                    else
                        System.out.print("\n");

                    if (j >= i)
                        x++;
                    else
                        x--;
                }
            }
            System.out.printf("\n");
            N = sc.nextInt();
        }
        sc.close();
    }
}
