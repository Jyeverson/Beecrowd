/**
Roumes era um aluno acima da média. Nas provas de matemática, ele sempre tirava nota máxima, acertando todas as contas, 
mas o segredo dele não estava em fazer contas corretamente. Ele interpretava o que via no ambiente a sua volta e conseguia 
deduzir as respostas para as questões. Você também pode ser alguém especial, igual a Roumes.

Entrada
A entrada consiste em vários casos de teste. Cada caso contém um número N, representando a quantidade de perguntas. 
Nas N linhas seguintes, aparece o que você viu para chegar na resposta.

Saída
Para cada pergunta feita, imprima a palavra ‘resposta’, seguida por um espaço, depois pelo número da pergunta, 
por dois pontos, um espaço e a resposta.
 */

import java.util.Scanner;
public class RespostaCerta_3302{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            int N = sc.nextInt();
            System.out.println("resposta " + i + ": " + N);
        }
        sc.close();
    }
}