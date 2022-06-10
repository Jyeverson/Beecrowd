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

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val vetor = IntArray(10)
    val V = sc.nextInt()
    vetor[0] = V
    println("N[0] = $V")
    var count = V
    for (i in 1..9) {
        count *= 2
        vetor[i] = count
        println("N[" + i + "] = " + vetor[i])
    }
    sc.close()
}