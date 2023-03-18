### Passeio 
Um passeio em grafo é uma sequência de vértices (nós) em um grafo, onde cada vértice na sequência está conectado ao próximo vértice na sequência por
uma aresta (uma conexão entre dois nós).

Formalmente, um passeio em grafo é uma sequência de vértices {v1, v2, ..., vk} em que cada par de vértices consecutivos (vi, vi+1) na sequência é conectado 
por uma aresta no grafo. O comprimento de um passeio em grafo é o número de arestas no caminho.

Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226116051-5088254e-603b-4e98-9931-306e278a04ef.png)

#### Tipos de Passeio:
- Passeio aberto: origem != término
- Passeio fechado: origem == término

## Trajeto 
Um trajeto é um passeio que não repete arestas. 

Exemplo: <br/> 
![image](https://user-images.githubusercontent.com/89612369/226116142-5b103136-d6a1-4905-96f9-8791b18db057.png)

## Caminho
Um caminho é um trajeto que não repete vértices. <br/>
Tamanho do caminho = nº de arestas. 

#### Tipos de caminho:
- Aberto: origem == término
- Fechado: origem != término

Exemplo: <br/> 
![image](https://user-images.githubusercontent.com/89612369/226116344-197c5e10-efac-4509-8428-eb391f5e2dfb.png)

### Algumas definições: 
- Distância geodésica: d(v, w) = menor caminho entre v e w. 
- Excentricidade de um vértice: E(v) = maior distância de v para qualquer outro vértice do grafo. 
- Raio de um grafo G: menor excentricidade de G. 
- Diâmetro: maior excentricidade de G. 

Exemplo 1: distância geodésica <br/>
![image](https://user-images.githubusercontent.com/89612369/226116532-d3cf3547-447a-4ad7-9d31-0cd581b6ae68.png)

Exemplo 2: excentricidade <br/>
![image](https://user-images.githubusercontent.com/89612369/226117330-bc0f55f2-d7ec-43f5-b3cd-99aa6aa0202a.png)

Exemplo 3: raio e diâmetro <br/>
![image](https://user-images.githubusercontent.com/89612369/226117352-09e74e2a-0ae7-4358-b90c-ddd15e7a5064.png)
