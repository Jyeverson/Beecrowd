package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class _1478 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        while (true) {
            int N = Integer.parseInt(reader.readLine().trim());

            if (N == 0) {
                break;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    int x = Math.min(Math.min(i, j), Math.min(N - i + 1, N - j + 1));
                    sb.append(String.format("%3d", x));
                    if (j < N) {
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }
            sb.append("\n");
            writer.print(sb.toString());
        }

        writer.flush();
        writer.close();
    }
}
