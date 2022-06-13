import java.util.Scanner;
import java.text.DecimalFormat;

public class SalaryIncrease_1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double salario = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");
        Double reajuste = 0.0;
        int percentual = 0;
        
        if(salario >= 0 && salario <= 400.00){
            reajuste = (15.00 / 100) * salario;
            salario += reajuste;
            percentual = 15;
        } else if(salario >= 400.01 && salario <= 800.00){
            reajuste = (12.00 / 100) * salario;
            salario += reajuste;
            percentual = 12;
        } else if(salario >= 800.01 && salario <= 1200.00) {
            reajuste = (10.00 / 100) * salario;
            salario += reajuste;
            percentual = 10;
        } else if(salario >= 1200.01 && salario <= 2000.00){
            reajuste = (7.00 / 100) * salario;
            salario += reajuste;
            percentual = 7;
        } else if(salario > 2000.00){
            reajuste = (4.00 / 100) * salario;
            salario += reajuste;
            percentual = 4;
        }
        System.out.println("Novo salario: " + df.format(salario));
		System.out.println("Reajuste ganho: " + df.format(reajuste));
		System.out.println("Em percentual: " + percentual + " %");
        sc.close();
    }
}
