import java.io.IOException;
import java.util.Scanner;

public class _1074 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if (x == 0)
				System.out.println("NULL");
			else if (x % 2 == 0 && x > 0)
				System.out.println("EVEN POSITIVE");
			else if (x % 2 == 0 && x < 0)
				System.out.println("EVEN NEGATIVE");
			else if (x % 2 != 0 && x > 0)
				System.out.println("ODD POSITIVE");
			else if (x % 2 != 0 && x < 0)
				System.out.println("ODD NEGATIVE");
		}
		sc.close();
	}
}