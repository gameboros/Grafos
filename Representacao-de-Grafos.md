# Representação de Grafo 

## Matriz de Incidência 
- Uma matriz de incidência representa univocamente um grafo G
- Um grafo G pode ser representado por diferentes matrizes de incidência pois 
pode-se permutar as linhas (vértices) e/ou colunas (arestas)
- Toda coluna da matriz de incidência possui apenas duas posições não nulas 
(= extremos da aresta)
- Ela permite a consulta eficiente à existência de arco incidente a um vértice – 
tempo constante, isto é, O(1)
- Ela ocupa um espaço proporcional a O(n × m) que pode ser O(n2) para grafos 
esparsos ou mesmo O(n3) para grafos densos

### 1. Matriz de Incidência - Grafo Direcionado 

Um grafo direcionado G com n vértices e m arestas permite uma representação por meio de uma matriz de incidência I com n linhas(uma para cada vértice) e m colunas 
(uma para cada aresta) em que o elemento Iij é dado por:
 - -1, se aresta j sai do vértice i 
 - +1, se aresta j entra no vértice i 
 - 0, caso contrário 

Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/223875387-9bb46e11-aece-4982-97a2-8d5793f1ab66.png)

Iij = 
| e1 | e2 | e3 | e4 | e5 | e6 | e7 | |
|--:|--:|--:|--:|--:|--:|--:|--:|
| -1 | -1 | 0 | 0 | 0 | 0 | 0 | a |
| +1 | 0 | -1 | -1 | +1 | 0 | 0 | b |
| 0 | +1 | 0 | 0 | -1 | -1 | 0 | c |
| 0 | 0 | +1 | 0 | 0 | +1  | -1 | d |
| 0 | 0 | 0 | +1 | 0 | 0 | +1 | e |

### 2. Matriz de Incidência - Grafo Não-direcionado 
Um grafo não direcionado G com n vértices e m arestas, permite representação por meio de uma matriz de incidência I com n linhas(uma para cada vértice) e m colunas
(uma para cada aresta) em que o elemento Iij é dado por:
- 1, se a aresta j incide no vértice i 
- 0, caso contrário 

Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/223881023-8402d9b9-39f5-427d-9860-1e978f2a13f4.png)

Iij = 
| e1 | e2 | e3 | e4 | e5 | e6 | e7 | |
|--:|--:|--:|--:|--:|--:|--:|--:|
| 1 | 1 | 0 | 0 | 0 | 0 | 0 | a |
| 1 | 0 | 1 | 1 | 1 | 0 | 0 | b |
| 0 | 1 | 0 | 0 | 1 | 1 | 0 | c |
| 0 | 0 | 1 | 0 | 0 | 1  | 1 | d |
| 0 | 0 | 0 | 1 | 0 | 0 | 1 | e |

## Matriz de Adjacência

Uma matriz de adjacência representa univocamente um grafo G
- Um grafo G pode ser representado por diferentes matrizes de adjacência pois 
pode-se permutar linhas e/ou colunas (vértices)
- A matriz de adjacência é simétrica para grafos não direcionados, pois quando o 
existir aresta entre dois vértices ela vale em ambas as direções
- Ela permite a consulta eficiente à existência de arco incidente a um vértice – 
tempo constante, isto é, O(1)
- Ela ocupa um espaço proporcional a O(n2) para grafos esparsos ou densos

### 3. Matriz de Adjacência - Grafo Direcionado 
Um grafo direcionado G com n vértices, permite representação por meio de uma matriz de adjacência 𝔸 com n linhas e n colunas (uma para cada vértice) em que o elemento 𝔸𝑖𝑗 é dado por:
- 1, se existir aresta saindo de i e entrando em j
- 0, caso contrário

Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/223881758-fda4c63d-4d5b-4977-b1a8-b7b4812f13b7.png)

Aij = 
| a | b | c | d | e | |
|--:|--:|--:|--:|--:|--:|
| 0 | 1 | 1 | 0 | 0  | a |
| 0 | 0 | 0 | 1 | 1 | b |
| 0 | 1 | 0 | 1 | 0 | c |
| 0 | 0 | 0 | 0 | 1 | d |
| 0 | 0 | 0 | 0 | 0 | e |

### 4. Matriz de Adjacência - Grafo Não-direcionado 
Um grafo não direcionado G com n vértices, permite representação por meio de uma matriz de adjacência 𝔸 com n linhas e n colunas (uma para cada vértice) em que o elemento 𝔸𝑖𝑗 é dado por:
- 1, se existir aresta entre i e j
- 0, caso contrário 

Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/223882370-8ddc2e4d-933f-405c-9f8a-903568dfdd7f.png)

Aij = 
| a | b | c | d | e | |
|--:|--:|--:|--:|--:|--:|
| 0 | 1 | 1 | 0 | 0  | a |
| 1 | 0 | 1 | 1 | 1 | b |
| 1 | 1 | 0 | 1 | 0 | c |
| 0 | 1 | 1 | 0 | 1 | d |
| 0 | 1 | 0 | 1 | 0 | e |


##  Lista de Adjacência 
-  As listas de adjacência representam univocamente um grafo G
- Um grafo G pode ser representado por diferentes listas de adjacência pois os 
elementos podem aparecer em qualquer ordem nas listas
- Para grafos direcionados, deve-se optar por armazenar os sucessores ou os 
predecessores dos vértices (ou dobrar o custo de armazenamento)
- A consulta é mais cara para se determinar a existência de arco incidente a um 
vértice – tempo linear no número de vértices, isto é, O(n) para grafo denso
- Ela ocupa um espaço proporcional a O(n + m)

### 5. Lista de Adjacência - Grafo Direcionado 

Dado grafo direcionado G = (V, E) com n vértices, é possível representá-lo por meio de n listas de adjacência de modo que a lista de adjacência do vértice v, ou 𝕃 [𝑣], contém todos os vértices que são sucessores (ou predecessores) de v.

Lista de sucessores: 𝕃 [𝑣] = {𝑤 ∈ V(G) | (𝒗, 𝑤) ∈ E(G)}

![image](https://user-images.githubusercontent.com/89612369/223883714-062cf264-cdf2-4fa7-80a3-2de060c5ebab.png)

![image](https://user-images.githubusercontent.com/89612369/223883881-6d315438-c5c7-4656-847f-e52176a3fbf6.png)


### 6. Lista de Adjacência - Grafo Não-direcionado 

Dado grafo não direcionado G = (V, E) com n vértices, é possível representá-lo por meio de n listas de adjacência (uma para cada vértice) de modo que a lista de adjacência do vértice v, ou 𝕃 𝑣 , contém os vértices adjacentes a v, isto é: <br/>
𝕃[𝑣] = {𝑤 ∈ V (G) | {𝑣, 𝑤} ∈ E(G)}

![image](https://user-images.githubusercontent.com/89612369/223883104-3bcef9dd-80c8-462a-8117-23b02323864d.png)

### 7. Lista de Adjacência por meio de Vetores 

![image](https://user-images.githubusercontent.com/89612369/223884300-60be87c5-0d0d-45b0-9fc9-3a01d3f5cb67.png)

![image](https://user-images.githubusercontent.com/89612369/223884402-06fdecf3-9fd9-45fb-acd1-2f22aa14f422.png)

![image](https://user-images.githubusercontent.com/89612369/223884448-703a498d-5e03-4a59-9586-f37a09dd40ee.png)


