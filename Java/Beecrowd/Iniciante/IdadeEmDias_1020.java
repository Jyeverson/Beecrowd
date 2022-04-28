/**
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
 Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
  Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido. 
 
 */

package iniciante;
import java.io.IOException;
import java.util.Scanner;

public class IdadeEmDias_1020 {
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