/*
a matemática, um número perfeito é um número inteiro para o qual a soma de todos 
os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número. 
Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um 
programa que imprima se um determinado número é perfeito ou não.

Entrada
A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N 
(1 ≤ N ≤ 20), indicando o número de casos de teste da entrada. Cada uma das N 
linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 108), que pode ser ou não, 
um número perfeito.

Saída
Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, 
de acordo com a especificação fornecida.
*/

import java.util.Scanner;
import java.io.IOException;

public class NumeroPerfeito_1164 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int soma = 0;
        for(int j = 0; j < N; j++){
            int X = sc.nextInt();
            for(int i= 1; i < X; i++){
                if(X % i == 0){
                    soma += i;
                }
            }
            if(soma == X){
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }
            soma = 0;
        }
    sc.close();
    }
}