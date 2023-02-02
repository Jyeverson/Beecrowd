import java.util.Scanner;

public class _1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int posMaior = 1;
		int x;
		for (int i = 1; i <= 100; i++) {
			x = sc.nextInt();
			if (i == 1) {
				maior = x;
				posMaior = 1;
			} else if (x > maior) {
				maior = x;
				posMaior = i;
			}
		}
		System.out.println(maior);
		System.out.println(posMaior);
		sc.close();
	}
}