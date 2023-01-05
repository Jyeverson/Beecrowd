/*
Recentemente aconteceu a fase regional da Maratona de Programação da SBC, onde mais de 600 times participaram em mais de 40 sedes diferentes pelo Brasil. 
Seu amigo participou da competição, e quando questionado sobre sua colocação lhe disse: “Ficamos no top 10”.

Você ficou feliz pelo seu amigo, mas não pode deixar de ficar curioso sobre qual foi sua real colocação. “Top 10” poderia indicar qualquer posição entre 
primeiro e décimo colocado, porém se ele estivesse em primeiro provavelmente teria dito “Top 1”, se estivesse em segundo ou terceiro provavelmente teria 
dito “Top 3”, e se estivesse em quarto ou quinto provavelmente teria dito “Top 5”. Logo, sua real colocação foi entre sexto e décimo, pois as pessoas 
geralmente se colocam na menor categoria a qual pertencem.

Você reuniu então todas as categorias de colocações que as pessoas mais usam: 1, 3, 5, 10, 25, 50 e 100. Dada uma colocação K, diga o número da menor 
categoria que esta colocação pertence.

Entrada
Cada caso de teste contém um inteiro K, representando uma colocação (1 ≤ K ≤ 100).

Saída
Para cada caso de teste imprima uma linha contendo a frase “Top N”, e substitua a letra N pelo número da menor categoria que a colocação K pertence.
 */

import java.util.Scanner;
public class TopN_1943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posicao = sc.nextInt();

        if(posicao == 1) System.out.println("Top 1");
        if(posicao > 1 && posicao <= 3) System.out.println("Top 3");
        if(posicao > 3 && posicao <= 5) System.out.println("Top 5");
        if(posicao > 5 && posicao <= 10) System.out.println("Top 10");
        if(posicao > 10 && posicao <= 25) System.out.println("Top 25");
        if(posicao > 25 && posicao <= 50) System.out.println("Top 50");
        if(posicao > 50 && posicao <= 100) System.out.println("Top 100");

        sc.close();
    }
}
