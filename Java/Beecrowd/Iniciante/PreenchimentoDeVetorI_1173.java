/*
Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor N[10]. 
Em cada posição subsequente, coloque o dobro do valor da posição anterior. Por exemplo, se o valor 
lido for 1, os valores do vetor devem ser 1,2,4,8 e assim sucessivamente. Mostre o vetor em seguida.

Entrada
A entrada contém um valor inteiro (V<=50).

Saída
Para cada posição do vetor, escreva "N[i] = X", onde i é a posição do vetor e X é o valor armazenado 
na posição i. O primeiro número do vetor N (N[0]) irá receber o valor de V.
 */

import java.util.Scanner;

public class PreenchimentoDeVetorI_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int V = sc.nextInt();
        vetor[0] = V;
        System.out.println("N[0] = " + V);
        int count = V;
        for(int i = 1; i < 10; i++){
            count *= 2;
            vetor[i] = count;
            System.out.println("N[" + i +"] = " + vetor[i]);
        }
        sc.close();
    }
}