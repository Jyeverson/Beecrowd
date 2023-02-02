import java.util.Scanner;

public class _1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 2; i <= N; i++) {
            System.out.println(i + "^ " + "2 = " + i * i);
            i = i + 1;
        }
        sc.close();
    }
}