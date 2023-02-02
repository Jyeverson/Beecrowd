import java.util.Scanner;

public class _1179 {
    public static void main(String[] args) {
        int impar[] = new int[5];
        int par[] = new int[5];
        int vImpar = 0;
        int vPar = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            int valor = sc.nextInt();
            if (valor % 2 != 0) {
                impar[vImpar] = valor;
                vImpar++;
                if (vImpar == 5) {
                    for (int lImpar = 0; lImpar < 5; lImpar++) {
                        System.out.println("impar[" + lImpar + "] = " + impar[lImpar]);
                    }
                    impar = new int[5];
                    vImpar = 0;
                }
            } else {
                par[vPar] = valor;
                vPar++;
                if (vPar == 5) {
                    for (int lPar = 0; lPar < 5; lPar++) {
                        System.out.println("par[" + lPar + "] = " + par[lPar]);
                    }
                    par = new int[5];
                    vPar = 0;
                }
            }
        }
        for (int lImpar = 0; lImpar < vImpar; lImpar++) {
            System.out.println("impar[" + lImpar + "] = " + impar[lImpar]);
        }
        for (int lPar = 0; lPar < vPar; lPar++) {
            System.out.println("par[" + lPar + "] = " + par[lPar]);
        }
        sc.close();
    }
}
