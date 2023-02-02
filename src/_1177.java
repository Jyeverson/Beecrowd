import java.util.Scanner;

public class _1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N[] = new int[1000];
        int T = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (count == T) {
                count = 0;
            }
            N[i] = count;
            System.out.println("N[" + i + "] = " + N[i]);
            count++;
        }
        sc.close();
    }
}
