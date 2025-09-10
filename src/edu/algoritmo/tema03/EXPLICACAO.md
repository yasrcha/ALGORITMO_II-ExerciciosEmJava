## Explicação do Exercício N°3

A lógica é a mesma em todos os exercícios, 
então explicar cada um deles seria repetitivo. Por 
esse motivo, esse **README** seguirá por uma explicação 
passo à passo de como o exercício foi resolvido.

Questão: Dos seguintes _pares de comandos_, quais têm o 
**resultado final alterado** quando se **muda a ordem** de 
**_execução_** dos mesmos.

#### A) Os códigos abaixo serão executados em ordem: <br>
X <- X + 1 + Y <br>
Z <- Y - X

|   |      X      | Y | Z |
|---|:-----------:|---|---|
| 1 |  X + 1 + Y  | Y | Z | 


- A **_linha 1_** colocaremos os valores de cada 
  variável após a execução do primeiro comando `X <- X + 
  1 + Y`.
  - O primeiro comando atribui a `X` o valor de `X + 1 + Y`.

|  |      X      |  Y  |         Z         |
|--|:-----------:|:---:|:-----------------:|
| 1 |  X + 1 + Y  |  Y  |         Z         | 
| 2 |  X + 1 + Y  |  Y  |  Y - (X + 1 + Y)  |

- Na **_linha 2_** colocaremos os valores de cada 
  variáveis após a execução da segunda linha de comando 
  `Z <- Y - X`.
- A segunda linha de comando atribui a `Z` o valor de `Y - X`.

Então porque Z não está valendo Y - Z, como foi declarado? Simples! Porque, antes de declararmos Z, declaramos X. Logo, quando dizemos que `Z = Y - X`, e `X` é `X + 1 + Y`, quer dizer que `Z = Y - (X + 1 + Y)`

|    |     X      | Y |        Z        |
|----|:----------:|:-:|:---------------:|
| 1  | X + 1 + Y  | Y |        Z        | 
| 2  | X + 1 + Y  | Y | Y - (X + 1 + Y) |
| 3  | X + 1 + Y  | Y |      -X-1       |

- Essa **_linha 3_** só existe para simplificar expressão que Z se tornou.

Agora, iremos para a próxima parte do exercício, que consiste em alterar a ordem de execução das linhas de comando. Quer dizer que agora a ordem de execução é: <br>

Z <- Y - X <br>
X <- X + 1 + Y <br>

|    |     X     | Y |   Z   |
|----|:---------:|:-:|:-----:|
| 1  |     X     | Y | Y - X | 
| 2  | X + 1 + Y | Y | Y - X |
| 3  | X + 1 + Y | Y | Y - X |

Comparando os valores finais (**_linha 3_**) de cada variável, podemos notar que o valor final de 'Z', quando executamos na primeira ordem, é '-X-1', enquanto seguindo a segunda ordem de execução o valor final fica 'Y - X'.

#### Por que isso aconteceu?

Quando definimos `Z = Y - X`, ainda não tinhamos declarado o valor de X, logo ele ainda valia apenas `X` e não `X + 1 + Y`, como na primeira ordem de execução. Quando, no segundo comando, definimos que `X = X + 1 + Y`, `Z` já tinha sido declarado, então a mudança no valor de `Y` não afeta ele.

**Reposta final é que sim, se alterarmos a ordem, o resultado final também será alterado.**

A mesma lógica seguirá para todos.
1. Declaramos os valores de cada variável após a execução do primeiro comando.
2. Declaramos os valores após o segundo comando.
   - Sem esquecer que a atribuição de valores durante o primeiro comando pode interferir no valor da variável modificada do segundo comando.
3. Simplificamos a expressão se necessário/se houver uma.
4. Fazemos o mesmo, mas com a ordem de execução invertida.
5. Comparamos o resultado final.