import java.io.IOException;
import java.util.Scanner;

public class ParisBetweenFiveNumbers_1065 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int x;
        int count = 0;

        for(int i = 0; i < 5; i++){
            x = sc.nextInt();
            if(x % 2 == 0) count++;
        }
        System.out.println(count + "valores pares");
        sc.close();
    }
 
}