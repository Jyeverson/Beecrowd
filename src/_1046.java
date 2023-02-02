import java.util.Scanner;

public class _1046 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hInicial = sc.nextInt();
    int hFinal = sc.nextInt();
    if (hInicial > hFinal) {
      System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
    } else if (hFinal > hInicial) {
      System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
    } else {
      System.out.println("O JOGO DUROU 24 HORA(S)");
    }
    sc.close();
  }
}