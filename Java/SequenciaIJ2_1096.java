/**
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo:
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5
 */
public class SequenciaIJ2_1096 {
    public static void main(String[] args) {
        int i =1;
		while (i <= 9) {
			for (int j = 7; j > 4; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
			i+=2;
		}
    }
}