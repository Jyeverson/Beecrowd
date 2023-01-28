/*
 Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. 
 Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio X se ele for ímpar. Por exemplo:
para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em 
uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma dos consecutivos números ímpares a partir do valor X.
 */
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val quantidade = sc.nextInt()
    var primos = 0
    var soma = 0
    for (i in 0 until quantidade) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        var l = x
        while (primos < y) {
            if (l % 2 != 0) {
                soma += l
                primos += 1
            }
            l++
        }
        println(soma)
        soma = 0
        primos = 0
    }
    sc.close()
}
