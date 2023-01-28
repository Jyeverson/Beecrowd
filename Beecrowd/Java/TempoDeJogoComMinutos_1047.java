/**
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”
 */
import java.util.Scanner;
public class TempoDeJogoComMinutos_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hI = sc.nextInt();
        int mI = sc.nextInt();
        int hF = sc.nextInt();
        int mF = sc.nextInt();
        int horas = hF - hI;
        int minutos = mF - mI;

        if(horas < 0){
            horas = 24 + (hF - hI);
        }
        if(minutos < 0){
            minutos = 60 + (mF - mI);
            horas--;
        }
        if(horas == -1){
            horas = 24 - 1;
        }
        if (hI == hF && mI == mF){ System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");}
        else{System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");}

        sc.close();
    }
}