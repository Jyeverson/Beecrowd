/*
O MacPRONALTS está com uma super promoção, exclusivo para os competidores da primeira 
Seletiva do MaratonaTEC. Só que teve um problema, todos os maratonistas foram tentar 
comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior é que a moça do 
caixa estava sem calculadora ou um programa para ajudá-la a calcular com maior 
agilidade, eis que surge você para fazer um programa para ajudar a coitada e aumentar 
a renda do MacPRONALTS. Segue o cardápio do dia contendo o número do produto e seu 
respectivo valor.

1001 | R$ 1.50

1002 | R$ 2.50

1003 | R$ 3.50

1004 | R$ 4.50

1005 | R$ 5.50

Entrada
A primeira entrada informada é a quantidade de produtos comprados (1 <= p <= 5). 
Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.

Obs.: não poderão ser informados números de produtos repetidos.

Saída
Você deve imprimir o valor da compra com duas casas decimais.
 */

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    sc.useLocale(Locale.ENGLISH)
    Locale.setDefault(Locale("en", "US"))
    var produtos = 0
    var quantidade = 0
    var res = 0.0
    var valor = 0.0
    val N = sc.nextLine().toInt()
    for (x in 0 until N) {
        produtos = sc.nextInt()
        quantidade = sc.nextInt()
        if (produtos == 1001) valor = 1.50 else if (produtos == 1002) valor =
            2.50 else if (produtos == 1003) valor = 3.50 else if (produtos == 1004) valor =
            4.50 else if (produtos == 1005) valor = 5.50
        res += valor * quantidade
    }
    System.out.printf("%.2f\n", res)
    sc.close()
}