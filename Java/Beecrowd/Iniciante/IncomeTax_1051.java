package iniciante;
import java.util.Scanner;

public class IncomeTax_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario >= 0 && salario <= 2000) {
        	System.out.println("Isento");
        } else if (salario > 2000 && salario <= 3000) {
        	System.out.println(String.format("R$ %.2f", (salario - 2000) * 0.08));
        } else if (salario > 3000 && salario <= 4500) {
        	System.out.println(String.format("R$ %.2f", ((salario - 3000)  * 0.18) + 80));
        } else {
        	System.out.println(String.format("R$ %.2f", ((salario - 4500) * 0.28) + 350));
        }
        sc.close();
    }
}