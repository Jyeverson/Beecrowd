import java.util.Scanner;

public class _2702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        if (d > a)
            count += (d - a);
        if (e > b)
            count += (e - b);
        if (f > c)
            count += (f - c);

        System.out.println(count);

        sc.close();
    }
}