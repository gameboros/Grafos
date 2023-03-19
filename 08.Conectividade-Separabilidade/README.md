## Fecho transitivo 
### Grafo Não Direcionado 
- Fecho transitivo de um vértice v (Γ(𝑣)) = conjunto de vértices alcançáveis a partir de v, incluindo v. 

### Grafo Direcionado 
- Fecho transitivo direto de um vértice v (Γ+(𝑣)) = conjunto de vértices alcançáveis a partir de v, inclusive v. 
- Fecho transitivo inverso = conjunto de vértices que alcançam v, inclusive v. 
- Base (B) = subconjunto de G tal qual não há caminhos entre elementos de B e todo vértice não pertencente a B pode ser alcançado por algum vértice B. <br/>
Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226186384-c8c06ccf-e9ef-4977-b486-06a9fd472927.png)
- Antibase (A) = subconjunto de G tal que não há caminhos entre elementos de A e todo vértice não pertencente a A pode alcançar por algum vértice de A. 
 ![image](https://user-images.githubusercontent.com/89612369/226191880-1b09f42e-be9a-455a-9222-d6ce0b320035.png)
- Raiz = se a base de um grafo for um conjunto unitário, então ela é dita raiz do grafo
- Antirraiz = se a antibase de um grafo for um conjunto unitário, então ela é dita antirraiz do grafo

## Conectividade 
### Grafo Não Direcionado Conexo 
- Todos os vértices são alcançáveis entre si / o fecho transitivo de qualquer vértice é igual ao conjunto de vértices. 
- É sempre possível fazer um passeio fechado que inclua todos os vértices. 

### Grafo Não Direcionado Desconexo 
- O fecho transitivo de algum vértice pode ser diferente do conjunto de vértices
- Componentes conexos = subgrafos maximais que são conexos 
- Subgrafo maximal conexo = maior subgrafo conexo do grafo 

### Grafo Direcionado 
- Grafo adjacente = grafo não direcionado obtido pela troca de cada aresta por outra não direcionada. 
![image](https://user-images.githubusercontent.com/89612369/226194655-38e0c2c1-f06f-4104-882e-608b744617fb.png)
- Um grafo direcionado G é dito conexo quando seu grafo subjacente G' for conexo também. 

#### Classificação 
- Simplesmente conexo (S-conexo): quando o grafo subjacente for conexo 
- Semifortemente conexo (SF-conexo): quando para todo par de vértices pelo menos um deles for alcançável a partir do outro 
- Fortemente conexo (F-conexo): quando todos os vértices foram mutuamente alcançáveis
- Componentes fortemente conexos: subgrafos maximais que são fortemente conexos

Exemplo 1: <br/>
![image](https://user-images.githubusercontent.com/89612369/226194790-d0e9f40b-fcf8-403b-bfb4-9eb5c2b45764.png)

Exemplo 2: componentes fortemente conexos <br/>
![image](https://user-images.githubusercontent.com/89612369/226194885-c9eec54c-8c47-47e6-b528-1a4827b804e7.png)

### Grafo Reverso 
- Grafo reverso/transposto = resultado da reversão de todas as arestas de um grafo. 
![image](https://user-images.githubusercontent.com/89612369/226197111-057a8722-ab60-4e44-bbbb-4293c56b27c7.png)


## Metodo de Kosaraju 
Cada árvore da floresta de profundidade corresponde a um componente f-conexo.

### Algoritmo 
1. fazer busca em profundidade em G 
2. construir o grafo reverso de G 
3. fazer busca em profundidade em GR em ordem decrescente de TT 

## Separabilidade 
### Corte de vértices 
Corte de vértices = subconjunto minimal de vértices V' (contido em V) cuja remoção transforma G em um grafo desconexo ou trivial (com apenas um vértice). <br/>
Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226205837-e6ea3f74-aa76-4c2b-8441-0115f45b7c6a.png)
 
### Corte de arestas 
- Corte de arestas = subconjunto minimal de arestas E' (contido em E) cuja remoção transforma G em um grafo desconexo. <br/>

Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226205938-060b08f7-4b38-4c4c-8444-e6e644d9ee08.png)

## Conectividade 
- Conectividade de vértices de um grafo G -> K(G) = cardinalidade do menor corte de vértices de G.
- Conectividade de arestas de um grafo G -> Y(G) = cardinalidade do menor corte de arestas de G.
- Para todo grafo: K(G) <= Y(G) <= S(G)

## Articulação 
Dado um grafo conexo G = (V, E), um vértice v pertencente a V é denominado articulação se a remoção do vértice v tornar G desconexo. <br/>
Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226206291-bb40f597-bfba-46d5-9ac3-c94d63ee70f1.png)

## Ponte 
Dado um grafo conexo G = (V, E), uma aresta {v, w} pertencente a E é chamada ponte se a remoção da aresta {v, w} tornar G desconexo. <br/>
Exemplo: <br/>
![image](https://user-images.githubusercontent.com/89612369/226206345-96a2e8b4-e2fa-40f7-9666-c2ae0bf8b7f8.png)
