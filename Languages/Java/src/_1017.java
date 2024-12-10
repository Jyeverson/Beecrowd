package src;

import java.util.Scanner;

public class _1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, r;
		a = sc.nextDouble();
		b = sc.nextDouble();
		r = (a * b) / 12;

		System.out.printf("%.3f\n", r);

		sc.close();
	}
}