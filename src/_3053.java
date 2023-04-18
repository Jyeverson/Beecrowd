import java.util.Scanner;

public class _3053 {
    public enum PosicaoCopo {
        A, B, C
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PosicaoCopo posicaoCopo = PosicaoCopo.valueOf(sc.next());

        for (int i = 0; i < N; i++) {
            int jogada = sc.nextInt();
            posicaoCopo = trocarPosicao(posicaoCopo, jogada);
        }

        System.out.println(posicaoCopo);
        sc.close();
    }

    public static PosicaoCopo trocarPosicao(PosicaoCopo posicaoCopo, int jogada) {
        switch (posicaoCopo) {
            case A:
                if (jogada == 1) {
                    return PosicaoCopo.B;
                } else if (jogada == 3) {
                    return PosicaoCopo.C;
                }
                break;
            case B:
                if (jogada == 1) {
                    return PosicaoCopo.A;
                } else if (jogada == 2) {
                    return PosicaoCopo.C;
                }
                break;
            case C:
                if (jogada == 2) {
                    return PosicaoCopo.B;
                } else if (jogada == 3) {
                    return PosicaoCopo.A;
                }
                break;
        }
        return posicaoCopo;
    }
}