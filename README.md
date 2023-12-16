# **Lista 04** <br />
## Lógica de Programação - Professor: Igor Mascarenhas <br />
### Conteúdos: Array, ArrayList, Map. <br />
<br />
1. Dado duas arrays A e B, escreva uma função que faça a
concatenação das arrays de forma alternada. Obs: Ambas as
arrays sempre serão do mesmo tamanho e não nulas. <br />
Exemplo 01: <br />
A: [1, 2, 3, 4] <br />
B: [5, 6, 7, 8] <br />
Output: [1, 5, 2, 6, 3, 7, 4, 8] <br />
Exemplo 02: <br />
A: [1, 3, 5, 7] <br />
B: [2, 4, 6, 8] <br />
Output: [1, 2, 3, 4, 5, 6, 7, 8] <br />
<br />
2. Dado uma array turma onde cada um dos seus elementos é
uma array com as notas de cada um dos alunos, calcule e
mostre a média de cada aluno e a média da turma. <br />
Exemplo: <br />
Turma: <br />
[ <br />
[9, 8, 7, 8], <br />
[10, 9, 8, 9], <br />
[9, 8, 7, 8] <br />
] <br />
Output: <br />
Aluno 0 - Média 8, <br />
Aluno 1 - Média 9, <br />
Aluno 2 - Média 8 <br />
Média da turma: 8,33 <br />
<br />
3. (leetcode) Dado um array nums. Definimos uma soma
acumulada de um array como nums[i] =
soma(nums[0]…nums[i]), ou seja, cada elemento deve ser a
soma de todos os elementos anteriores e o atual. Por fim,
retorne a array com as somas. <br />
Exemplo 01: <br />
nums = [1,2,3,4] <br />
Output: [1,3,6,10] <br />
Explicação: A soma acumulada é obtida da seguinte forma: [1,1+2, 1+2+3, 1+2+3+4]. <br />
Exemplo 02: <br />
nums = [1,1,1,1,1] <br />
Output: [1,2,3,4,5] <br />
Explicação: A soma acumulada é obtida da seguinte forma: [1,1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]. <br />
<br />
4. Eleições (Utilize o Map<K, V>) - Faça um programa que
recebe o nome de 3 candidatos e inicia uma votação (10 votos).
Para votar, o eleitor deve escrever o nome do candidato. Caso o
eleitor vote em um nome que não existe, deverá ser
contabilizado um voto nulo. Ao final da votação, mostre o
vencedor da eleição com a porcentagem. <br />
<br />
5. (leetcode - 724. Find Pivot Index) Dada uma matriz de
números inteiros, calcule o índice pivô dessa matriz. O índice
pivô é o índice onde a soma de todos os números estritamente à
esquerda do índice é igual à soma de todos os números
estritamente à direita do índice. Se o índice estiver na borda
esquerda da matriz, a soma esquerda será 0 porque não há
elementos à esquerda. Isso também se aplica à borda direita da
matriz. Retorna o índice de pivô mais à esquerda. Se tal índice
não existir, retorne -1.
(https://leetcode.com/problems/find-pivot-index/)
