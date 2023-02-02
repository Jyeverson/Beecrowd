import java.util.Scanner;

public class _2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acertos = 0;
        int T = sc.nextInt();

        for (int i = 0; i <= 4; i++) {
            int competidor = sc.nextInt();
            if (competidor == T)
                acertos += 1;
        }
        System.out.println(acertos);
        sc.close();
    }
}