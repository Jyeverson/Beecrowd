/* 
Escreva um programa que leia três valores com ponto flutuante de dupla precisão:
 A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

*/

import java.util.Scanner;

public class Area_1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double PI = 3.14159;
		double AT = A * C / 2;
	    double AC = PI * (C * C);
	    double ATR = (A + B) * C / 2;
	    double AQ = B * B;
	    double AR = A * B;
		
	    System.out.printf(String.format("TRIANGULO: %.3f",AT));
	    System.out.println();
	    System.out.printf(String.format("CIRCULO: %.3f",AC));
	    System.out.println();
	    System.out.printf(String.format("TRAPEZIO: %.3f",ATR));
	    System.out.println();
	    System.out.printf(String.format("QUADRADO: %.3f",AQ));
	    System.out.println();
	    System.out.printf(String.format("RETANGULO: %.3f",AR));
	    System.out.println();
	    
		sc.close();
	}
}