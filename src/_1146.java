import java.util.Scanner;

public class _1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean validacao = true;
        while (validacao) {
            int x = sc.nextInt();
            if (x == 0) {
                validacao = false;
            } else {
                for (int i = 1; i < x; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(x);
            }
        }
        sc.close();
    }
}