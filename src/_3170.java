import java.util.Scanner;

public class _3170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int G = sc.nextInt();

        if (G / 2 <= B) {
            System.out.println("Amelia tem todas bolinhas!");
        } else {
            if (B % 2 != 0) {
                G -= 1;
                System.out.println("Faltam " + ((G / 2) - B) + " bolinha(s)");
            } else {
                System.out.println("Faltam " + ((G / 2) - B) + " bolinha(s)");
            }
        }
        sc.close();
    }
}