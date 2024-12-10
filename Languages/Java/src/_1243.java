package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1243 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int soma = 0;
        int media = 0;
        int quantidade = 0;

        String frase;

        while ((frase = reader.readLine()) != null) {
            String[] fraseSemEspacos = frase.split(" ");
            for (int i = 0; i < fraseSemEspacos.length; i++) {
                if (isPalavraValida(fraseSemEspacos[i])) {
                    soma += fraseSemEspacos[i].length();
                    quantidade++;
                }
            }
            if (quantidade > 0) {
                media = soma / quantidade;
            }
            if (media <= 3) {
                System.out.println(250);
            } else if (media == 4 || media == 5) {
                System.out.println(500);
            } else if (media >= 6) {
                System.out.println(1000);
            }
            soma = 0;
            media = 0;
            quantidade = 0;
        }

        reader.close();

    }

    public static boolean isPalavraValida(String palavra) {
        return palavra.matches("\\b[A-Za-zÀ-ÖØ-öø-ÿ’-]+\\.?\\b");
    }

}
