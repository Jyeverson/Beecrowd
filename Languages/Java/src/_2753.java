package src;

public class _2753 {
    public static void main(String[] args) {
        int count = 0;
        String[] abc = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        for (int i = 97; i <= 122; i++) {
            System.out.println(i + " e " + abc[count]);
            count += 1;
        }
    }
}