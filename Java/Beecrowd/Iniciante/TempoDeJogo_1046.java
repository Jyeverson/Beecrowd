/**
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, 
 sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
 */

import java.util.Scanner;

public class TempoDeJogo_1046 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hInicial = sc.nextInt();
    int hFinal = sc.nextInt();
    if (hInicial > hFinal) { System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)"); }
    else if (hFinal > hInicial) { System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)"); }
    else { System.out.println("O JOGO DUROU 24 HORA(S)"); }
  }
}