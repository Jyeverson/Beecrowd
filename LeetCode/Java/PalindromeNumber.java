/*
Link para o exercicio -> 

Dado um inteiro x, retorne true se x for um palíndromo, e false caso contrário .

Exemplo 1:
Entrada: x = 121
 Saída: verdadeiro
 Explicação: 121 é lido como 121 da esquerda para a direita e da direita para a esquerda.

Exemplo 2:
Entrada: x = -121
 Saída: falso
 Explicação: Da esquerda para a direita, lê -121. Da direita para a esquerda, torna-se 121-. Portanto, não é um palíndromo.

Exemplo 3:
Entrada: x = 10
 Saída: falso
 Explicação: Lê 01 da direita para a esquerda. Portanto, não é um palíndromo.
 */

class Solution {
    public boolean isPalindrome(int x) {
        int i = 0;
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        while(x > i){
            i*= 10;
            i+= (x % 10);
            x /= 10;
        }
        return x == i || x == i/10;
    }
}