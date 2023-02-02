/**
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência
de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) 
deve ser solicitado um novo código (até que seja válido). 
O programa será encerrado quando o código informado for o número 4.

Entrada
A entrada contém apenas valores inteiros e positivos.

Saída
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram
 cada tipo de combustível, conforme exemplo.
*/
import java.util.Scanner;

public class TipoDeCmobustivel_1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean fim = true;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while(fim){
            int combustivel = sc.nextInt();
            if(combustivel == 1){alcool += 1;}
            if(combustivel == 2){gasolina += 1;}
            if(combustivel == 3){diesel += 1;}
            if(combustivel == 4){fim = false;}
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
