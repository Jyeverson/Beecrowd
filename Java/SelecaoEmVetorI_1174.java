/*

Link this problem -> https://www.beecrowd.com.br/judge/pt/problems/view/1174

 Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 
 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, 
com uma casa após o ponto decimal.
*/

import java.util.Scanner;

public class SelecaoEmVetorI_1174 {
    public static void main(String[] args) {
        Double vetor[] = new Double[100];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            vetor[i] = sc.nextDouble();
            if (vetor[i] <= 10) {
                System.out.println("A[" + i + "]" + " = " + vetor[i]);
            }
        }
        sc.close();
    }
}