package src;

import java.util.Scanner;

public class _1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codgPa = sc.nextInt();
		int numberPa = sc.nextInt();
		double pricePa = sc.nextDouble();
		int codgPb = sc.nextInt();
		int numberPb = sc.nextInt();
		double pricePb = sc.nextDouble();
		double resultado = (numberPa * pricePa) + (numberPb * pricePb);

		System.out.printf("VALOR A PAGAR: R$ %.2f", resultado);
		System.out.println();
		sc.close();
	}
}
