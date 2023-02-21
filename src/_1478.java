import java.util.Scanner;

public class _1478 {

<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x;
        while (N != 0) {
            for (int i = 1; i <= N; i++) {
                x = i;
                for (int j = 1; j <= N; j++) {
                    if (i == j)
                        x = 1;

                    System.out.printf("%3d", x);
                    if (j < N)
                        System.out.print(" ");
                    else
                        System.out.print("\n");

                    if (j >= i)
                        x++;
                    else
                        x--;
                }
            }
            System.out.printf("\n");
            N = sc.nextInt();
        }
        sc.close();
    }
}
=======
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
>>>>>>> 60859a2c95e3c281cd0eeffc9e69baa48e643367
