/*O setor financeiro da empresa precisa de um relatório que mostre o código e o 
nome dos produtos cujo preço são menores que 10 ou maiores que 100.
*/

SELECT id, name 
FROM products
WHERE price < 10 OR price > 100 