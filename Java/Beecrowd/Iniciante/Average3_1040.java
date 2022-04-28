package iniciante;
import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Average3_1040 {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double n1 = leitor.nextDouble();
		double n2 = leitor.nextDouble();
		double n3 = leitor.nextDouble();
		double n4 = leitor.nextDouble();
        double MEDIA = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;
		System.out.println("Media: " + df.format(MEDIA));

        if (MEDIA >= 7) { System.out.println("Aluno aprovado."); } 

        else if (MEDIA < 7 && MEDIA >= 5) {
        	System.out.println("Aluno em exame.");
        	double NExame = leitor.nextDouble();
			System.out.println("Nota do exame: " + df.format(NExame));

        	MEDIA = (MEDIA + NExame) / 2;

        	if (MEDIA >= 5) { System.out.println("Aluno aprovado."); } 

            else { System.out.println("Aluno reprovado."); }

			System.out.println("Media final: " + df.format(MEDIA)); } 

            else { System.out.println("Aluno reprovado."); }
	}
}
