import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _1848 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> piscadas = new ArrayList<>();
        String gritos = "";
        int resultado1 = 0, resultado2 = 0, resultado3 = 0;

        while (input.hasNextLine()) {
            String linha = input.nextLine();
            if (linha.equals("caw caw")) {
                if (gritos.length() == 3) {
                    resultado1 = Integer.parseInt(piscadas.get(0).replace("*", "1").replace("-", "0"), 2);
                    resultado2 = Integer.parseInt(piscadas.get(1).replace("*", "1").replace("-", "0"), 2);
                    resultado3 = Integer.parseInt(piscadas.get(2).replace("*", "1").replace("-", "0"), 2);
                    break;
                }
                gritos += linha;
            } else {
                piscadas.add(linha);
            }
        }

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}