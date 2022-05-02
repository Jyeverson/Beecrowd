/**
Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

Entrada
A entrada contém um valor inteiro N (N < 10000).

Saída
Imprima todos valores que quando divididos por N dão resto = 2, um por linha.
 */

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`);
    val N = sc.nextInt();

    for(i in 0..10000){
        if(i % N == 2){
            println(i);
        }
    }
    sc.close();
}
