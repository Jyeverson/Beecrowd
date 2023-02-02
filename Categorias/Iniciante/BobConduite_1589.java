/*
Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o 
segundo raio R2. Você precisa comprar um conduite circular (veja a imagem abaixo que 
ilustra um conduite) de maneira a passar os dois cabos por dentro dele:



Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois 
círculos, qual o raio do menor círculo que possa englobar ambos os dois?

Entrada
Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de 
teste.

Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os 
respectivos raios. Os inteiros serão positivos e todas as contas caberão em um 
inteiro normal de 32 bits.
Saída
Em cada caso, imprima o menor raio possível em uma única linha
 */

import java.io.IOException;
import java.util.Scanner;

public class BobConduite_1589 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int R1 = sc.nextInt();
            int R2 = sc.nextInt();
            System.out.println(R1 + R2);
        }
        sc.close(); 
    }
}