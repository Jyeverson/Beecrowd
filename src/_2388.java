import java.util.Scanner;

public class _2388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = 0;
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();
            int v = sc.nextInt();
            distancia += v * t;
        }
        System.out.println(distancia);
        sc.close();
    }
}