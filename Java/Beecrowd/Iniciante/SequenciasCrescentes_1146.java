/**
Este programa deve ler uma variável inteira X inúmeras vezes (deve parar quando o valor no arquivo
de entrada for igual a zero). Para cada valor lido imprima a sequência de 1 até X, com um espaço 
entre cada número e seu sucessor.

Obs: cuide para não deixar espaço em branco após o último valor apresentado na linha ou você receberá 
Presentation Error.

Entrada
O arquivo de entrada contém vários números inteiros. O último número no arquivo de entrada é 0.

Saída
Para cada número N do arquivo de entrada deve ser impressa uma linha de 1 até N, conforme o exemplo abaixo. 
Não deve haver espaço em branco após o último valor da linha.
 */

import java.util.Scanner;

 public class SequenciasCrescentes_1146{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Boolean validacao = true;
         while(validacao){
            int x = sc.nextInt();
            if(x == 0){ 
                validacao = false;
            } else {
            for(int i = 1; i < x; i++){
                System.out.print(i + " ");
            }
            System.out.println(x);
            }
        }
         sc.close();
     }
 }