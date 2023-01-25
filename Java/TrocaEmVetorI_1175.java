
/*
Link this problem -> https://www.beecrowd.com.br/judge/pt/problems/view/1175

Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., 
até trocar o 10º com o 11º. Mostre o vetor modificado.

Entrada
A entrada contém 20 valores inteiros, positivos ou negativos.

Saída
Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
 */
import java.util.Scanner;

public class TrocaEmVetorI_1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[20];
        int vetor1[] = new int[20];

        // dois loops a qual nao me orgulho
        for (int i = 0; i < 20; i++) {
            int local = 19 - i;
            vetor[i] = sc.nextInt();
            vetor1[local] = vetor[i];
        }
        for (int j = 0; j < 20; j++) {
            System.out.println("N[" + j + "] = " + vetor1[j]);
        }

        sc.close();
    }
}
