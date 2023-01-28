/**
Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A + i para cada i com os valores (0 <= i <= N-1). 
Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão na mesma linha.

Saída
A saída contém apenas um valor inteiro.
 */

import java.util.Scanner

fun main() {

 		var sc = Scanner(System.`in`)
        var A = sc.nextInt()
        var N = sc.nextInt()
        var soma = 0
        while (N <= 0) {
        	N = sc.nextInt()
        }
        for(i in 0..N-1){
            soma += A + i
        }
        println(soma)
	
}