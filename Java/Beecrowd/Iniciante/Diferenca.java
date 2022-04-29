/**
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B
  pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço
 em branco antes e depois da igualdade.
 */

package iniciante;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();		
		int D = sc.nextInt();
		int DIFERENCA;
		DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);	
		sc.close();
	}
}