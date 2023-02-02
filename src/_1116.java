import java.util.Scanner;

public class _1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println((double) X / Y);
            }
        }
        sc.close();
    }
}