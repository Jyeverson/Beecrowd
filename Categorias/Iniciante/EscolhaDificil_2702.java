/*
Em um longo voo, companhias aéreas oferecem uma refeição aos seus passageiros. Geralmente as aeromoças conduzem carrinhos contendo as refeições 
pelos corredores do avião. Quando o carrinho chega em sua fileira, você é questionado imediatamente: “Frango, bife, ou massa?”. Você sabe suas opções, 
mas você tem apenas alguns segundos para escolher e você não sabe qual a aparência de sua escolha pois seu vizinho ainda não abriu o embrulho…

A aeromoça deste voo decidiu alterar o procedimento. Primeiro ela vai perguntar a todos os passageiros qual sua escolha de refeição, e depois 
vai checar se o número de refeições disponíveis neste voo para cada escolha é suficiente.

Por exemplo, considere que o número de refeições de frango, bife e massa disponíveis são respectivamente (80, 20, 40), enquanto o número de 
passageiros que escolheu frango, bife e massa seja respectivamente (45,23, 48). Neste caso, onze pessoas seguramente ficaram sem suas respectivas 
escolhas de refeição, já que três passageiros que queriam bife e oito que gostariam de massa não poderão ser atendidos.

Dada a quantidade de refeições disponíveis para cada escolha e o número de refeições pedidas para cada escolha, você poderia por favor ajudar a 
aeromoça a determinar quantos passageiros seguramente não poderão ser atendidos?

Entrada
A primeira linha contem três inteiros Ca, Ba e Pa (0 ≤ Ca, Ba, Pa ≤ 100), representando respectivamente o número de refeições disponiveis de frango, 
bife e massa. A segunda linha contem três inteiros Cr, Br e Pr (0 ≤ Cr, Br, Pr ≤ 100), indicando respectivamente o número de refeições requisitadas 
de frango, bife e massa respectivamente.

Saída
Imprima uma única linha com um inteiro representando o número de passageiros que seguramente não receberão sua escolha de refeição.
 */

import java.util.Scanner;

public class EscolhaDificil_2702{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int count = 0;

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        if(d > a) count += (d - a);
        if(e > b) count += (e - b);
        if(f > c) count += (f - c);

        System.out.println(count);

        sc.close();
    }
}