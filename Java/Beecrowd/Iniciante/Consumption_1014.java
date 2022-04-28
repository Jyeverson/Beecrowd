package iniciante;
import java.util.Scanner;

public class Consumption_1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		double y = sc.nextDouble();
		double z = x / y;
		
		System.out.printf("%1.3f km/l", z);
		System.out.println();
		sc.close();
	}
}