/*
Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de 
um indivíduo. O último dado, que não entrará nos cálculos, contém o valor de idade negativa. 
Calcular e imprimir a idade média deste grupo de indivíduos.

Entrada
A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um 
valor negativo for lido.

Saída
A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
 */
import java.util.Scanner;

public class Idades_1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        float soma = 0;
        float qtd = 0;
        while(x != 0){
            int y = sc.nextInt();
            if(y < 0){
                x = 0;
            } else {
            soma += y;
            qtd += 1;
            }
        }
        System.out.printf("%.2f", soma / qtd);
        System.out.println("");
        sc.close();
    }
}