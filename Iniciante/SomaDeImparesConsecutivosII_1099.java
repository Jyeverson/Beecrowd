/**
Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
*/

import java.util.Scanner;
public class SomaDeImparesConsecutivosII_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int primo = 0;
        for(int i = 1; i <= N; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(X > Y){
                for(int j = X -1; j > Y; j--){
                    if(j % 2 != 0){
                        primo += j;
                    }
                }
                System.out.println(primo);
                primo = 0;
            } else if(X < Y) {
                for(int j = X +1; j < Y; j++){
                    if(j % 2 != 0){
                        primo += j;
                    }
                }
                System.out.println(primo);
                primo = 0;
            } else {
                primo = 0;
                System.out.println(primo);
            }
        }
        sc.close();
    }
}