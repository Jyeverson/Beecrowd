package iniciante;
public class PairNumbers_1059 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        int contador = 1;
        for (int i = 1; i <= 100; i++) {
            if ( i % 2 == 0) {
                contador++;
                System.out.println(i);
            }
        }
    }
}