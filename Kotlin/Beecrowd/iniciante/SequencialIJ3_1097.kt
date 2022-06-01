/*
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
*/
fun main(args: Array<String>) {
    var cont = 0
    var seq = 7
    var i = 1
    while (i <= 9) {
        println("I=$i J=$seq")
        seq--
        cont++
        if (cont == 3) {
            i = i + 2
            cont = 0
            seq = i + 6
        }
    }
}