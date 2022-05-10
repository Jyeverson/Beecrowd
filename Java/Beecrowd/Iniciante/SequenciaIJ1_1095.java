import javax.swing.plaf.synth.SynthSplitPaneUI;

/**
Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo

Exemplo:
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
 */

public class SequenciaIJ1_1095 {
    public static void main(String[] args) {
        int i = 1;
            for(int j = 60; j >= 0; j-=5){
                System.out.println("I="+i + " J="+j);
                i += 3;
            }
    }
}