import java.util.Scanner;

public class _1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stop = 0;
        while (stop == 0) {
            int count = 0;
            int value = 0;
            int x = sc.nextInt();
            if (x == 0) {
                stop = 1;
            } else {
                for (int i = x; count < 5; i++) {
                    if (i % 2 == 0) {
                        value += i;
                        count += 1;
                    }
                }
                System.out.println(value);
            }
        }

        sc.close();
    }
}