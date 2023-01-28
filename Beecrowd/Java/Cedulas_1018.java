/**
 Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
  As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

import java.util.Scanner;
public class Cedulas_1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		System.out.println(valor);
		System.out.println(valor / 100 + " nota(s) de R$ 100,00");
		valor = valor % 100;
		System.out.println(valor / 50 + " nota(s) de R$ 50,00");
		valor = valor % 50;
		System.out.println(valor / 20 + " nota(s) de R$ 20,00");
		valor = valor % 20;
		System.out.println(valor / 10 + " nota(s) de R$ 10,00");
		valor = valor % 10;
		System.out.println(valor / 5 + " nota(s) de R$ 5,00");
		valor = valor % 5;
		System.out.println(valor / 2 + " nota(s) de R$ 2,00");
		valor = valor % 2;
		System.out.println(valor / 1 + " nota(s) de R$ 1,00");
		sc.close();
	}
}