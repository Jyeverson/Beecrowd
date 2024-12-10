package src;

import java.io.*;

public class _1564 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null) {
            int n = Integer.parseInt(linha);
            if(n == 0){
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }
    }

}