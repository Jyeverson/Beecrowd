/**
 Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
 Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
 Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" 
 e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 

Entrada
A entrada é composta por vários casos de testes contendo valores inteiros.

Saída
Para cada valor lido mostre a mensagem correspondente à descrição do problema.
 */

import java.util.Scanner;
public class SenhaFixa_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=2; i>1; i++){
            int senha = sc.nextInt();
            if(senha == 2002){
                System.out.println("Acesso Permitido");
                i = 0;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        sc.close();
    }
}