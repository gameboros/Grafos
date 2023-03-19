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

### Trajeto 
Um trajeto é um passeio que não repete arestas. 

Exemplo: <br/> 
![image](https://user-images.githubusercontent.com/89612369/226116142-5b103136-d6a1-4905-96f9-8791b18db057.png)

### Caminho
Um caminho é um trajeto que não repete vértices. <br/>
Tamanho do caminho = nº de arestas. 

#### Tipos de caminho:
- Aberto: origem == término
- Fechado: origem != término

Exemplo: <br/> 
![image](https://user-images.githubusercontent.com/89612369/226116344-197c5e10-efac-4509-8428-eb391f5e2dfb.png)


### Ciclo
Um ciclo é um caminho fechado. 

Exemplo:
![image](https://user-images.githubusercontent.com/89612369/226150742-53b35aef-e34e-40bc-954b-2ab1f874c5ad.png)



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

- Grafo linear: possui 2 vértices de grau 1 e os demais possuem grau 2. <br/>
Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226150753-42125a97-e8fa-443b-824f-5d94dd4c7531.png)

- Grafo ciclo: possui um único ciclo passando por todos os seus vértices. <br/>
Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226150764-19488b7b-de64-4ac1-ac00-bd813188fd72.png)

## Noções de Conectividade
### Grafo conexo 
Um grafo G = (V, E) é dito conexo quando existir pelo menos um caminho para todo par de vértices. <br/>
Exemplo 1: <br/>
![image](https://user-images.githubusercontent.com/89612369/226150907-10fa23d6-7ec8-41d9-b462-1f32d7b6ac5c.png)
Exemplo 2:  <br/>
![image](https://user-images.githubusercontent.com/89612369/226150929-62301919-eb95-4869-87fb-2b9497e7c2f4.png)
Exemplo 3: <br/>
![image](https://user-images.githubusercontent.com/89612369/226151012-0708d5f7-ef6f-4773-876c-b738518423c7.png)


Dado um grafo simples G = (V, E) com n vértices e k componentes. O nº mínimo de arestas de G = n - k. 
- Nº de arestas de um grafo = nº de vértices - nº de arestas.   
- Nº máximo de arestas de G = (n-k)x(n-k+1)/2 arestas. 
![image](https://user-images.githubusercontent.com/89612369/226151197-864fbcf8-5453-41d5-a2d4-07e2da0e3e15.png)


