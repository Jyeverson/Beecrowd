import java.util.Scanner;
import java.io.IOException;

public class _1070 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while (count < 6) {
            if (x % 2 == 1) {
                System.out.println(x);
                count++;
            }
            x++;
        }

        sc.close();
    }

}