/**
 Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
 indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */

import java.util.Scanner;

import java.util.Scanner;
public class Multiplos_1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A % B == 0 || B % A == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
     }
}