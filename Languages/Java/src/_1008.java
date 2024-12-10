package src;

import java.util.Scanner;

public class _1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerofuncionario = sc.nextInt();
		int horastrabalhadas = sc.nextInt();
		double valorporhora = sc.nextDouble();

		System.out.println("NUMBER = " + numerofuncionario);

		System.out.printf("SALARY = U$ %.2f", horastrabalhadas * valorporhora);
		System.out.println();
		sc.close();
	}
}