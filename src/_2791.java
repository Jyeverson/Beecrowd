import java.util.Scanner;
import java.io.IOException;

public class _2791 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        String c3 = sc.nextLine();
        String c4 = sc.nextLine();
        String lugar = c1 + c2 + c3 + c4;
        int indice = lugar.indexOf("1");
        System.out.println(indice + 1);

        /*
         * if(c1 == 1) System.out.println(1);
         * if(c2 == 1) System.out.println(2);
         * if(c3 == 1) System.out.println(3);
         * if(c4 == 1) System.out.println(4);
         */
        sc.close();
    }
}
