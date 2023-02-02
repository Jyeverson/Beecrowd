import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(a ^ b);
        }
        sc.close();
    }
}