import java.util.Scanner;

public class _3048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int identity = 0;
        int identity2 = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (i % 2 != 0) {
                identity = x;
            } else {
                identity2 = x;
            }
            if (identity != identity2) {
                count += 1;
            }
        }
        System.out.println(count);
        sc.close();
    }
}