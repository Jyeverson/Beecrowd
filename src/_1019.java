import java.io.IOException;
import java.util.Scanner;

public class _1019 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int duracaoSegundos = sc.nextInt();

        int horas = duracaoSegundos / 3600;
        duracaoSegundos -= horas * 3600;

        int minutos = duracaoSegundos / 60;
        duracaoSegundos -= minutos * 60;

        int segundos = duracaoSegundos;
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}