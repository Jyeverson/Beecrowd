/**
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores,
sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha.
Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 */

import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    for(i in 1..N){
        val n1 = sc.nextDouble()
        val n2 = sc.nextDouble()
        val n3 = sc.nextDouble()
        val media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10
        System.out.println(String.format("%.1f", media))
    }
    sc.close();
}