/**
Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero).
 Para cada par lido, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
 */

import java.util.Scanner;
public class SequenciaDeNumerosESoma_1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean loop = true;
        int soma = 0;
        while(loop){
            int M = sc.nextInt();
            int N = sc.nextInt();
            
            if(M <= 0 || N <= 0){
                loop = false;
            } else if(M > N){
                for(int i = N; i <= M; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
                soma = 0;
            } else if(M < N){
                for(int i = M; i <= N; i++){
                    System.out.print(i + " ");
                    soma += i;
                }
                System.out.println("Sum=" + soma);
                soma = 0;
            }
        }
        sc.close();
    }
}