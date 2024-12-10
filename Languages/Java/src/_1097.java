package src;

public class _1097 {
    public static void main(String[] args) {
        int cont = 0;
        int seq = 7;
        for (int i = 1; i <= 9;) {
            System.out.println("I=" + i + " J=" + seq);
            seq--;
            cont++;
            if (cont == 3) {
                i = i + 2;
                cont = 0;
                seq = i + 6;
            }
        }
    }
}