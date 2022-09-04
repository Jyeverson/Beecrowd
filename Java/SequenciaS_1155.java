/*
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 1/2 + 1/3 + … + 1/100

Entrada
Não há nenhuma entrada neste problema.

Saída
A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
 */
public class SequenciaS_1155 {
    public static void main(String[] args) {
        double S = 1;
        for(int i = 2; i <= 100; i++){
            S += 1.00 / i;
        }
        System.out.println(String.format("%.2f", S));
    }
}