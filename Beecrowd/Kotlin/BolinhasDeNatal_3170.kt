/*
Amélia ama o Natal, e sua parte favorita nesta data é montar a árvore de natal! Ela 
adora decorar a árvore com bolinhas e luzes coloridas, para que ela fique brilhante e 
divertida! Porém, Amélia gosta das coisas bem distribuídas e exige que sua árvore não 
tenha mais que a metade de galhos em bolinhas. Assim, se sua árvore de natal tem G 
galhos, ela precisa G/2 bolinhas. Se o número G de galhos for ímpar, esse valor será 
arredondado para baixo.

Neste ano, Amélia resolveu atualizar sua árvore e irá comprar uma nova. Além disso, 
algumas de suas bolinhas quebraram, e ela vai precisar saber quantas novas bolinhas 
vai precisar comprar para manter sua árvore equilibrada do jeito que gosta!

Para isso, ela quer sua ajuda! Dada a quantidade de bolinhas que Amélia tem e a 
quantidade de galhos que sua nova árvore terá, diga para Amélia quantas bolinhas 
de natal ela precisa comprar para decorar sua nova árvore!

Entrada
A entrada consiste de dois valores inteiros, lidos em duas linhas, B (1 < B < 103) 
e G (100 < G < 1000) que indicam, respectivamente, a quantidade de bolinhas que 
Amélia já possui e a quantidade de galhos de sua nova árvore de natal.

Saída
Imprima a quantidade de bolinhas que Amélia precisa comprar para completar sua árvore, 
com a mensagem "Faltam B bolinha(s)", onde B é a quantidade de bolinhas que Amelia 
precisa comprar. Caso Amelia possua bolinhas suficientes ou de sobra, imprima a 
mensagem "Amelia tem todas bolinhas!"
 */
 
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val B = sc.nextInt()
    var G = sc.nextInt()
    if (G / 2 <= B) {
        println("Amelia tem todas bolinhas!")
    } else {
        if (B % 2 != 0) {
            G -= 1
            println("Faltam " + (G / 2 - B) + " bolinha(s)")
        } else {
            println("Faltam " + (G / 2 - B) + " bolinha(s)")
        }
    }
    sc.close()
}
