import java.io.IOException;
import java.util.Scanner;

public class _1020 {
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);

		int idade = entrada.nextInt();
		int idadeAno = (idade / 365);
		idade = (idade % 365);
		int idadeMes = (idade / 30);
		int idadeDias = (idade % 30);

		System.out.printf("%d ano(s)%n", idadeAno);
		System.out.printf("%d mes(es)%n", idadeMes);
		System.out.printf("%d dia(s)%n", idadeDias);
		entrada.close();
	}
}