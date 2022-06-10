/*
Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e 
negativos do vetor X por 1. Em seguida mostre o vetor X.

Entrada
A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.

Saída
Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor 
armazenado naquela posição.
 */

import java.util.*
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val vetor = IntArray(10)
    for (i in 0..9) {
        val entrada = sc.nextInt()
        if (entrada <= 0) {
            vetor[i] = 1
        } else {
            vetor[i] = entrada
        }
        println("X[" + i + "] = " + vetor[i])
    }
    sc.close()
}