import java.util.Scanner;

public class _3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int N = sc.nextInt();
        int jogadas = 0;
        String copo = sc.next();
        int[] posicaoCopo = posicao(copo);

        for(int i = 0; i < N; i++){
            jogadas = sc.nextInt();
            int valueT = posicaoCopo[0];
            if(jogadas == 1){
                posicaoCopo[0] =  posicaoCopo[1];
                posicaoCopo[1] = valueT;
            }
            if(jogadas == 2){
                valueT = posicaoCopo[1];
                posicaoCopo[1] =  posicaoCopo[2];
                posicaoCopo[2] = valueT;
            }
            if(jogadas == 3){
                valueT = posicaoCopo[2];
                posicaoCopo[2] =  posicaoCopo[0];
                posicaoCopo[0] = valueT;
            }
        }
        if(posicaoCopo[0] == 1){
            System.out.println("A");
        } else if(posicaoCopo[1] == 1){
            System.out.println("B");
        } else if(posicaoCopo[2] == 1){
            System.out.println("C");
        }
       sc.close();
    }

    public static int[] posicao(String copo){
        int[] posicaoCopo = {0,0,0};
        switch (copo) {
            case "A":
                posicaoCopo[0] = 1;
                posicaoCopo[1] = 0;
                posicaoCopo[2] = 0;
                break;
            case "B":
                posicaoCopo[0] = 0;
                posicaoCopo[1] = 1;
                posicaoCopo[2] = 0;
                break;
            case "C":
                posicaoCopo[0] = 0;
                posicaoCopo[1] = 0;
                posicaoCopo[2] = 1;
                break;
        }
        return posicaoCopo;
    }

}