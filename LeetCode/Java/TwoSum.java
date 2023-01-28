/*
Link do problema-> https://leetcode.com/problems/two-sum/

Dada uma matriz de inteiros nums e um inteiro target, retorne os índices dos dois números de modo que eles somemtarget .

Você pode supor que cada entrada teria exatamente uma solução e não pode usar o mesmo elemento duas vezes.

Você pode retornar a resposta em qualquer ordem.


Exemplo 1:
Entrada: nums = [2,7,11,15], target = 9
 Saída: [0,1]
 Explicação: Como nums[0] + nums[1] == 9, retornamos [0, 1].

Exemplo 2:
Entrada: nums = [3,2,4], alvo = 6
 Saída: [1,2]

Exemplo 3:
Entrada: nums = [3,3], alvo = 6
 Saída: [0,1]
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j != i){
                    if((nums[i] + nums[j]) == target){
                        return new int[] { i, j };
                    }
                }
            }
            
        }
        return null;
    }
}