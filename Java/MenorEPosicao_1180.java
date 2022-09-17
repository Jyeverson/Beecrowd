import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class MenorEPosicao_1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> x = new Vector<>(); 
        
        for(int i = 0; i < n; i++){
            int y = sc.nextInt();
            x.add(y);
        }
        
        int min = Collections.min(x);
        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + x.indexOf(min));

        sc.close();
    }
}