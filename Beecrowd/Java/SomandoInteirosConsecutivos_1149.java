/**
Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). 
Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão na mesma linha.

Saída
A saída contém apenas um valor inteiro.
 */

import java.util.Scanner;

public class SomandoInteirosConsecutivos_1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int soma = 0;
        while (N <= 0) {
        	N = sc.nextInt();
        }
        for(int i = 0; i <= N-1; i++){
            soma += A + i;
        }
        System.out.println(soma);
        sc.close();
    }
}
