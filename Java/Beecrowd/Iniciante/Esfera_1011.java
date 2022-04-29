package iniciante;
import java.util.Scanner;

public class Esfera_1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		double R = sc.nextInt();
		double volume = (4/3.0) * PI * (R * R * R);
		
		System.out.printf(String.format("VOLUME = %.3f", volume));
		System.out.println();	
		sc.close();
	}
}