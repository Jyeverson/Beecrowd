import java.util.Scanner;

public class _1478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int conta=1, L, C, aux, X=1;
		int N = sc.nextInt();
        
		while (N != 0){
			for(L=1 ; L<=N ; L++){
				for(C=L ; C>=1 ; C--)
					System.out.printf("%3d",C);
				for(C=2 ; C<=N-L+1 ; C++)
					System.out.printf("%3d",C);
				System.out.printf("\n");
			}
			N = sc.nextInt();
		}
	sc.close();
	}
}