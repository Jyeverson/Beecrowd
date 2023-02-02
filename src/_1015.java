import java.util.Scanner;

public class _1015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double content = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
        double distance = Math.sqrt(content);

        System.out.printf("%.4f\n", distance);
        sc.close();
    }
}