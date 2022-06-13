/*
Ler um número inteiro N e calcular todos os seus divisores.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Escreva todos os divisores positivos de N, um valor por linha.
 */
import java.util.Scanner;
 public class DivisoresI_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();     
        for(int i = 1; i <= N; i++){
            if( N % i == 0)System.out.println(i);
        }
        sc.close();
    }
}
