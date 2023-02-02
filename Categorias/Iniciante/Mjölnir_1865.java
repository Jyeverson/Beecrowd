/*
Odin criou para Thor a mais fiel e poderosa arma possível, o martelo Mjölnir. 
Feito de um minério místico especial chamado Uru e forjado no coração de uma 
estrela pelos Deuses ferreiros de Asgard, Brokk e Eitri, os lendários ferreiros.

Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mjölnir.

Escreva um programa que, dado um nome, e a força, em Newtons, aplicado ao tentar 
levantar o Mjölnir, informar se a pessoa conseguiu ou não levantá-lo.

Entrada
Um número inteiro C será informado, que será a quantidade de casos de teste. 
Cada caso de teste inicia com uma palavra, que é o primeiro nome de quem está 
tentando levantar o Mjölnir, e um inteiro N (1 ≤ N ≤ 25000), indicando a força 
aplicada para cima, em Newtons, ao puxar o martelo, de modo a tentar levantá-lo.

Saída
Para cada caso de teste imprima um caractere ‘Y’, caso a pessoa tenha conseguido 
levantar , ou ‘N’, caso não tenha conseguido.
 */

import java.util.Scanner;

public class Mjölnir_1865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
    
        for(int i = 0; i < C; i++){
            String nome = sc.next();
            int N = sc.nextInt();
            if(nome.equalsIgnoreCase("thor"))System.out.println("Y");
            else{
                System.out.println("N");
            }
        } 
        sc.close();
    }
}
