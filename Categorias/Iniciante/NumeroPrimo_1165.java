import java.util.Scanner;
public class NumeroPrimo_1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            int X = sc.nextInt();
            if(X % 2 == 0){
                System.out.println(X + " nao eh primo");
            } else {
                System.out.println(X + " eh primo");
                
            }
        }
        sc.close();
    }
}
