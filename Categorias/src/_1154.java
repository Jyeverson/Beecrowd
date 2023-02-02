import java.util.Scanner;

public class _1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        float soma = 0;
        float qtd = 0;
        while (x != 0) {
            int y = sc.nextInt();
            if (y < 0) {
                x = 0;
            } else {
                soma += y;
                qtd += 1;
            }
        }
        System.out.printf("%.2f", soma / qtd);
        System.out.println("");
        sc.close();
    }
}