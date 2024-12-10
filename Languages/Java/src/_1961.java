package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class _1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> canos = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            canos.add(sc.nextInt());
        }

        boolean pulo = IntStream.range(0, canos.size() - 1)
                .anyMatch(i -> Math.abs(canos.get(i) - canos.get(i + 1)) > P);

        if (pulo) {
            System.out.println("GAME OVER");
        } else {
            System.out.println("YOU WIN");
        }

    }
}