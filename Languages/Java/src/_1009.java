package src;

import java.io.IOException;
import java.util.Scanner;

public class _1009 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String Name = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendas = sc.nextDouble();
		double total = ((vendas * 15) / 100) + salarioFixo;

		System.out.println(String.format("TOTAL = R$ %.2f", total));
		sc.close();
	}
}