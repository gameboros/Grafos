# Representação de Grafo 
## Matriz de Incidência - Grafo Direcionado 
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

## Matriz de Incidência - Grafo Não-Direcionado 
Um grafo não direcionado G com n vértices e m arestas, permite representação por meio de uma matriz de incidência I com n linhas(uma para cada vértice) e m colunas
(uma para cada aresta) em que o elemento Iij é dado por:

