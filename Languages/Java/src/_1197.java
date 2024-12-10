package src;

import java.util.Scanner;

public class _1197 {
	public static void main(String[] args) {
		int v, t, s, doubleS;
		Scanner sc = new Scanner(System.in);
		int EOF = -1;
		while (((v = sc.nextInt()) != EOF)) {
			t = sc.nextInt();
			s = v * t;
			doubleS = s * 2;
			System.out.println(doubleS);
		}
		sc.close();
	}
}
