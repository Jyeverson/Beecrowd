package iniciante;
import java.util.Scanner;

public class CircleArea_1002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;		
		double raio = sc.nextDouble();
		double area = pi * Math.pow(raio, 2);
	
        System.out.printf("A=%.4f", area);
		System.out.println();
		
		sc.close();
	}
}
