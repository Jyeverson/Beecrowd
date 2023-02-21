import java.io.IOException;
import java.util.Scanner;

public class _2146 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int senha = sc.nextInt();
            System.out.println(senha - 1);
        }
        sc.close();
    }
}