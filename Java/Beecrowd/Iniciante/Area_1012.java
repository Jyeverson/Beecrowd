package iniciante;
import java.util.Scanner;

public class Area_1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double PI = 3.14159;
		double AT = A * C / 2;
	    double AC = PI * (C * C);
	    double ATR = (A + B) * C / 2;
	    double AQ = B * B;
	    double AR = A * B;
		
	    System.out.printf(String.format("TRIANGULO: %.3f",AT));
	    System.out.println();
	    System.out.printf(String.format("CIRCULO: %.3f",AC));
	    System.out.println();
	    System.out.printf(String.format("TRAPEZIO: %.3f",ATR));
	    System.out.println();
	    System.out.printf(String.format("QUADRADO: %.3f",AQ));
	    System.out.println();
	    System.out.printf(String.format("RETANGULO: %.3f",AR));
	    System.out.println();
	    
		sc.close();
	}
}