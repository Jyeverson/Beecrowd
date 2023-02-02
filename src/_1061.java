import java.io.IOException;
import java.util.Scanner;

public class _1061 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;
        String[] SdiaInicial = leitor.nextLine().split(" ");
        String[] ShoraInicial = leitor.nextLine().replaceAll(" ", "").split(":");
        String[] SdiaFinal = leitor.nextLine().split(" ");
        String[] ShoraFinal = leitor.nextLine().replaceAll(" ", "").split(":");
        int diaInicial = Integer.parseInt(SdiaInicial[1]);
        int horaInicial = Integer.parseInt(ShoraInicial[0]);
        int minutoInicial = Integer.parseInt(ShoraInicial[1]);
        int segundoInicial = Integer.parseInt(ShoraInicial[2]);
        int diaFinal = Integer.parseInt(SdiaFinal[1]);
        int horaFinal = Integer.parseInt(ShoraFinal[0]);
        int minutoFinal = Integer.parseInt(ShoraFinal[1]);
        int segundoFinal = Integer.parseInt(ShoraFinal[2]);

        if (segundoFinal < segundoInicial) {
            totalSegundos += (60 - segundoInicial) + segundoFinal;
            totalMinutos--;
        } else if (segundoFinal > segundoInicial) {
            totalSegundos += segundoFinal - segundoInicial;
        } else {
            totalSegundos = 0;
        }

        if (minutoFinal < minutoInicial) {
            totalMinutos += (60 - minutoInicial) + minutoFinal;
            totalHoras--;
        } else if (minutoFinal > minutoInicial) {
            totalMinutos += minutoFinal - minutoInicial;
        } else {
            totalMinutos = 0;
        }

        if (horaFinal < horaInicial) {
            totalHoras += (24 - horaInicial) + horaFinal;
            totalDias--;
        } else if (horaFinal > horaInicial) {
            totalHoras += horaFinal - horaInicial;
        } else {
            totalHoras = 0;
        }

        if (diaFinal < diaInicial) {
            totalDias += (30 - diaInicial) + diaFinal;
        } else if (diaFinal > diaInicial) {
            totalDias += diaFinal - diaInicial;
        } else {
            totalDias = 0;
        }

        System.out.println(totalDias + " dia(s)");
        System.out.println(totalHoras + " hora(s)");
        System.out.println(totalMinutos + " minuto(s)");
        System.out.println(totalSegundos + " segundo(s)");
    }

}