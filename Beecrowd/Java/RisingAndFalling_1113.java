import java.util.Scanner;

public class RisingAndFalling_1113 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        for(int i = 1; i > 0; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X > Y){
                System.out.println("Decrescente");
            } else if (X < Y){
                System.out.println("Crescente");
            } else if(X == Y){
                i = -1;
            }
        }
        sc.close();
    }
}
