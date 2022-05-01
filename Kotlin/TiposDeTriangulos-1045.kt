/**
 Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
 A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

 se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
 */

import java.util.Scanner;
fun main(args: Array<String>) {

    val sc = Scanner(System.`in`);
    var A = sc.nextDouble()
    var B = sc.nextDouble()
    var C = sc.nextDouble()

    var D = 0.0

    if (B > A && B > C) {
        D = A
        A = B
        B = D
    } else if (C > A) {
        D = A
        A = C
        C = D
    }

    if(A >= B+ C){ println("NAO FORMA TRIANGULO") }

    else{
        if(A*A == (B*B) + (C*C)){ println("TRIANGULO RETANGULO") }
        if(A*A > (B*B) + (C*C)){println("TRIANGULO OBTUSANGULO") }
        if(A*A < (B*B) + (C*C)){println("TRIANGULO ACUTANGULO") }
        if(A == B && A == C){println("TRIANGULO EQUILATERO") }
        if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) println("TRIANGULO ISOSCELES")
    }
    sc.close();
}