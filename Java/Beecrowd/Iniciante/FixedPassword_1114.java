package iniciante;
import java.util.Scanner;
public class FixedPassword_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=2; i>1; i++){
            int senha = sc.nextInt();
            if(senha == 2002){
                System.out.println("Acesso Permitido");
                i = 0;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}