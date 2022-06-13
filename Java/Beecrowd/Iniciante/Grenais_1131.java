/**
A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. 
Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, 
o algoritmo deve ser executado novamente solicitando o número de gols marcados pelos times em uma nova partida, 
caso contrário deve ser encerrado imprimindo:

- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).

Entrada
O arquivo de entrada contém 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Grêmio respectivamente. 
Em seguida háverá um inteiro (1 ou 2), correspondente à repetição do programa.

Saída
Após cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". 
Quando o algoritmo for encerrado devem ser mostradas as estatísticas conforme a descrição apresentada acima. 
Obs: a palavra "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 */
import java.util.Scanner;

public class Grenais_1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vInter = 0;
        int vGremio = 0;
        int empates = 0;
        int grenais = 1;      
        int grenal = 1;
        while(grenal == 1){
            int inter = sc.nextInt();
            int gremio = sc.nextInt();
            if(inter > gremio){
                vInter += 1;
            } else if (gremio > inter) {
                vGremio +=1;
            } else{
                empates += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int novoGrenal = sc.nextInt();
            if(novoGrenal == 1) {
                grenal = 1;
                grenais += 1;
            } else if (novoGrenal == 2) {
                grenal = 2;
            }
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vInter);
        System.out.println("Gremio:" + vGremio);
        System.out.println("Empates:" + empates);
        if(vInter > vGremio){
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
        sc.close();
    }
}