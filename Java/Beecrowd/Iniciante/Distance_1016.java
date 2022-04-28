package iniciante;
import java.io.IOException;
import java.util.Scanner;

public class Distance_1016 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int km = sc.nextInt();
        int minutos = (60 * km) / 30;
        
        System.out.println(minutos + " minutos"); 
        sc.close();
    }
}