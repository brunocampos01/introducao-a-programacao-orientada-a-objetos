# Introdução a programação orientada à objetos
![License](https://img.shields.io/badge/Code%20License-MIT-blue.svg)
![java](https://img.shields.io/badge/UFSC-Introdu%C3%A7%C3%A3o%20a%20programa%C3%A7%C3%A3o%20orientada%20%C3%A0%20objetos-red.svg)

## Describe project
Exercícios, exemplos e resumos sobre Java e orientação à objetos.

## Pre Requirements
- Java 8 ou superior:<br/>

## Summary
- [Primeiros programas](https://github.com/brunocampos01/intro-a-programacao-orientada-a-objetos/tree/master/primeiros_programas)
- [Algoritmos matemáticos](https://github.com/brunocampos01/intro-a-programacao-orientada-a-objetos/tree/master/algoritmos_matematicos)
- [Estruturas de seleção](https://github.com/brunocampos01/intro-a-programacao-orientada-a-objetos/tree/master/estruturas_de_selecao)
- [Estruturas de repetição](https://github.com/brunocampos01/intro-a-programacao-orientada-a-objetos/tree/master/estruturas_de_repeticao)


## Instruções de Controle
- Estrutura de sequência (o processador lê linha por linha)
- Estrutura de seleção
- Estrutura de repetição

### Estrutura de repetição
Em JAVA há 3: 
- While 
- Do...while 
- For 

#### While 
- Uma instrução de repetição (ou um loop) permite especificar que um programa deve repetir uma ação enquanto alguma condição permanece verdadeira.  
- O loop só é executado se a condição for TRUE. 


#### Do...while 
- A instrução de repetição do while é semelhante à instrução while. 
- Aqui o loop é executado 1 vez SEMPRE!!! 
- A instrução do while testa a condição de continuação do loop depois de executar o corpo do loop. 

<img src="imagens/do-while.png" />


Em UML:

<img src="imagens/do-whole-uml.png" />

#### For

<img src="imagens/for.png" />

#### For each

<img src="imagens/for-ap.png" />

O que isso significa em português claro: "a cada elemento de nameArray, atribua o elemento a variável 'name' e execute o corpo do loop." 

Como o compilador interpretaria: 
- Criar uma variável de string chamada name e configura-la com nulo. 
- Atribuir o primeiro valor de nameArray a variável name. 
- Executar o corpo do loop (o bloco de código dentro das chaves). 
- Atribuir o próximo valor de nameArray a name. 
- Repetir enquanto ainda houver elementos na matriz
- Exemplo

<img src="imagens/ex-foreach.png" />


#### Diferenças entre FOR e WHILE
Ele será útil quando você não souber quantas vezes o loop será executado e quiser continuar a executado apenas enquanto alguma condição for verdadeira. <br/>
Mas se você souber quantas vezes o loop será executado (por exemplo, dependendo do tamanho de uma matriz, 7 vezes, etc.), um loop for será mais simples. Aqui está o loop anterior reescrito usando-se while. 






## References 
- Java: como programar, autor Paul Deitel

## Author
- Bruno Aurélio Rôzza de Moura Campos (brunocampos01@gmail.com)
## Copyright
<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br />This work by <span xmlns:cc="http://creativecommons.org/ns#" property="cc:attributionName">Bruno A. R. M. Campos</span> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Attribution-ShareAlike 4.0 International License</a>.
