/**
Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
*/

import java.util.Scanner;
public class QuadradoEAoCubo_1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int calculo = 0;
        for(int i = 1; i <= N; i++){
            System.out.print(i + " ");
            System.out.print(i * i + " ");
            calculo = i * i;
            System.out.println(calculo * i);
        }
        sc.close();
    }
}