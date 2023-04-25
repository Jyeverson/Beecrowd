public class _1059 {
    public static void main(String[] args) {
        int contador = 1;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contador++;
                System.out.println(i);
            }
        }
    }
}