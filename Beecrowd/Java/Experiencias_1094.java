/**
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda
para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, 
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias 
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada
uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Experiencias_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.valueOf(sc.readLine());
    	int totalCoelhos = 0;
    	int totalRatos = 0;
    	int totalSapos = 0;

        for (int i = 0; i < N; i++) {
    		String info = sc.readLine();
    		String[] infos = info.split(" ");
    		int Quantia = Integer.valueOf(infos[0]);
    		char Tipo = infos[1].toUpperCase().charAt(0);
    		switch (Tipo) {
	    		case 'C': totalCoelhos += Quantia; break;
	    		case 'R': totalRatos += Quantia; break;
	    		case 'S': totalSapos += Quantia; break;
    		}
    	}
        int totalCobaias = totalCoelhos + totalRatos + totalSapos;
    	double mediaCoelhos = (totalCoelhos * 100) / (double) totalCobaias;
    	double mediaRatos = (totalRatos * 100) / (double) totalCobaias;
    	double mediaSapos = (totalSapos * 100) / (double) totalCobaias;
    	System.out.println("Total: " + totalCobaias + " cobaias");
    	System.out.println("Total de coelhos: " + totalCoelhos);
    	System.out.println("Total de ratos: " + totalRatos);
    	System.out.println("Total de sapos: " + totalSapos);
    	System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
    	System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
    	System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");
    }
}