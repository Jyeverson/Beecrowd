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
import java.util.Scanner;

public class SomaDeÍmparesConsecutivosIII_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = sc.nextInt();
        int primos = 0;
        int soma = 0;

        for(int i = 0; i < quantidade; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int l = x; primos < y; l++){
                if(l % 2 != 0){
                    soma += l;
                    primos+=1;
                }
            }
            System.out.println(soma);
            soma = 0;
            primos = 0;
        }
        sc.close();
    }
}
