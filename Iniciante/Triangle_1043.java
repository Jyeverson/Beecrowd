import java.io.IOException;
import java.util.Scanner;
 
public class Triangle_1043 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if((a < b + c) && (b < a + c) && (c < a + b)){
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
    } else {
          double area = ((a + b) * c) / 2;
          System.out.printf("Area = %.1f\n", area);
      }
      sc.close();
    }
}