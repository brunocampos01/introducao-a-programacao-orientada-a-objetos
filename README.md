# Introdução a Programação Orientada à Objetos
![License](https://img.shields.io/badge/Code%20License-MIT-blue.svg)
![java](https://img.shields.io/badge/UFSC-Introdu%C3%A7%C3%A3o%20a%20programa%C3%A7%C3%A3o%20orientada%20%C3%A0%20objetos-blue.svg)

Exercícios, exemplos e resumos sobre fundametos de programação orientada à objetos.

## Requisitos
- Java 8 ou superior
```shell script
sudo apt install default-jdk default-jre
java -version
javac -version
```
## Exercícios em Java
- [Primeiros programas](primeiros-programas)
- [Algoritmos matemáticos](algoritmos-matematicos)
- [Estruturas de seleção](estruturas-de-selecao)
- [Estruturas de repetição](estruturas-de-repeticao)


## Instruções de Controle
- Estrutura de sequência (o processador lê linha por linha)
- Estrutura de seleção
- Estrutura de repetição

### Estrutura de repetição
- While 
- Do...while 
- For 

#### While 
- Uma instrução de repetição (ou um loop) permite especificar que um programa deve repetir uma ação enquanto alguma condição permanece verdadeira.  
- O loop só é executado se a condição for TRUE. 


#### Do...while 
- A instrução de repetição do while é semelhante à instrução while. 
- Aqui o loop é executado 1 vez SEMPRE!!! 

<img src="img/do-while.jpg" />


- A instrução do while testa a condição de continuação do loop depois de executar o corpo do loop. 

<img src="img/do-while.png" />


Em UML:

<img src="img/do-whole-uml.png" />

#### For

<img src="img/for.png" />

#### For each

<img src="img/for-ap.png" />

O que isso significa em português claro: "a cada elemento de nameArray, atribua o elemento a variável 'name' e execute o corpo do loop." 

Como o compilador interpretaria: 
- Criar uma variável de string chamada name e configura-la com nulo. 
- Atribuir o primeiro valor de nameArray a variável name. 
- Executar o corpo do loop (o bloco de código dentro das chaves). 
- Atribuir o próximo valor de nameArray a name. 
- Repetir enquanto ainda houver elementos na matriz
- Exemplo

<img src="img/ex-foreach.png" />


#### Diferenças entre FOR e WHILE
Ele será útil quando você não souber quantas vezes o loop será executado e quiser continuar a executado apenas enquanto alguma condição for verdadeira. <br/>
Mas se você souber quantas vezes o loop será executado (por exemplo, dependendo do tamanho de uma matriz, 7 vezes, etc.), um loop for será mais simples. Aqui está o loop anterior reescrito usando-se while. 

---

## Conceitos Básicos

#### Objeto (Entidade)
- É uma abstração de algo real, em termos de POO
- Ex) um livro, uma página de um livro, uma viagem, uma data, um pedido, uma música... 

#### Características
- Tem existência própria (é único); 
- Tem identificação; 
- Tem características de como é composto (agregado a outros objetos), como cor, tamanho, tempo, etc; 
- Ocupa espaço na memória, depois de criado (instanciado); 

<img src="img/do-while.png" />

**Atributos**: São as características dos objetos. 
<br/>
**Comportamentos**: São as ações que o objeto pode fazer ou ações que o objeto pode sofrer.  

##### Representação de um objeto PORTA:  
<img src="img/do-while.png" />


**Abstraindo ...**
- O Objeto fechadura, maçaneta e outro são agregados ao objeto porta. 
- Em linguagens procedurais diz que a função tem: 
  - Campos e Métodos. 


#### Classes 
##### Por que usar a palavra classe? 
  - A palavra classe vem da taxonomia da biologia. Todos os seres vivos de uma mesma classe biológica têm uma série de atributos e comportamentos em comum, mas não são iguais, podem variar nos valores desses atributos e como realizam esses comportamentos. 

##### Classificar
Quando objetos possuem características (atributos e comportamentos) em comum nós classificamos. 

##### Definição 
Uma classe (ideia) especifica quais os principais atributos e comportamentos (serviços) que o objeto (concreto) deve possuir para serem classificados nesta classe. Exemplo de classe: 

- Classe: 
  - camisa t-shirt mormai 
- Características da classe: 
  - Tem manga curta; 
  - Feito de algodão; 
- Comportamentos da classe: 
  - São elásticas; 
  - Protegem do frio; 

- Objeto A: 
  - Caraterísticas - Tem manga curta; Feito de algodão; Tem cor azul; 
  - Comportamentos - São elásticas; Protegem do frio; 

**Classificação** – mesmo o objeto A tendo uma característica a mais ele pode ser classificado nesta classe, pois ele possui todos os atributos e comportamentos que a classe exige. 

##### Toda Classe define para seus objetos
- Atributos (estrutura do objeto). EX) cor da parede. 
- Métodos (comportamentos que os objetos podem fazer ou sofrerem ações). 
- Como são representados esses atributos (variáveis ou outros objetos). 


“O mundo dos objetos encontra-se fora do método main().” 

---

#### Referências 
- Aulas do professor Mariane - UFSC
- Java: como programar (Paul Deitel)
- Head First: Java

---
<p  align="left">
<br/>
<a href="mailto:brunocampos01@gmail.com" target="_blank"><img src="https://github.com/brunocampos01/devops/blob/master/images/email.png" alt="Gmail" width="30">
</a>
<a href="https://stackoverflow.com/users/8329698/bruno-campos" target="_blank"><img src="https://github.com/brunocampos01/devops/blob/master/images/stackoverflow.png" alt="GitHub" width="30">
</a>
<a href="https://www.linkedin.com/in/brunocampos01" target="_blank"><img src="https://github.com/brunocampos01/devops/blob/master/images/linkedin.png" alt="LinkedIn" width="30"></a>
<a href="https://github.com/brunocampos01" target="_blank"><img src="https://github.com/brunocampos01/devops/blob/master/images/github.png" alt="GitHub" width="30"></a>
<a href="https://brunocampos01.netlify.app/" target="_blank"><img src="https://github.com/brunocampos01/devops/blob/master/images/blog.png" alt="Website" width="30">
</a>
<a href="https://medium.com/@brunocampos01" target="_blank"><img src="https://github.com/brunocampos01/devops/blob/master/images/medium.png" alt="GitHub" width="30">
</a>
<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons License" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png",  align="right" /></a><br/>
</p>

