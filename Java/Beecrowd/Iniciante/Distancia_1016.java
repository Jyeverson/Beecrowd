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
import java.io.IOException;
import java.util.Scanner;

public class Distancia_1016 {
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int km = sc.nextInt();
        int minutos = (60 * km) / 30;
        
        System.out.println(minutos + " minutos"); 
        sc.close();
    }
}