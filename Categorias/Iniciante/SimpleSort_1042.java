import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] array = {a,b,c};
        
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2] + "\n");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        sc.close();
    }
}