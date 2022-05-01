/* 
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo,
 da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido,
  através das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.

*/

import java.io.IOException;
import java.util.Scanner;

public class Animal_1049 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String p1 = sc.next();
		String p2 = sc.next();
		String p3 = sc.next();

		if (p1.equalsIgnoreCase("vertebrado")) {
			if (p2.equalsIgnoreCase("ave")) {
				if (p3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (p3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (p2.equalsIgnoreCase("inseto")) {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (p3.equalsIgnoreCase("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}			
			}
		}
        sc.close();
	}
	
}