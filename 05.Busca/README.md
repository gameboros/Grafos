## Busca em Grafo 
- vértices e arestas não examinados = não marcados/não explorados 
- aresta após ser examinada = aresta marcada/explorada
- vértice examinado porém com arestas ainda não marcadas = vértice alcançado, porém não explorado
- vértice examinado com todas as arestas marcadas = vértice alcançado e explorado
- final de uma busca completa = todos os vértices e arestas estão marcados


## Busca Genérica 
- vértice inicial = raiz da busca 

O critério utilizado para escolher o vértice marcado v produz diferentes buscas. 
- Busca em Profundidade: dentre todos os vértices marcados e incidentes a alguma aresta ainda não explorada, escolher aquele mais recentemente alcançado na busca
- Busca em Largura: dentre todos os vértices marcados e incidentes a alguma aresta ainda não explorada, escolher aquele menos recentemente alcançado na busca


### Busca genérica - Algoritmo 
Etapas: 
1. Dado o grafo G = (V, E), desmarcar todos os vértices
2. Passo inicial: escolher e marcar um vértice
3. Passo geral: Enquanto houver um vértice v marcado e incidente a uma aresta {v, w} não explorada: <br/>
  a. escolher o vértice marcado v  <br/>
  b. escolher e explorar uma aresta {v, w} <br/>
  c. Se o vértice w não está marcado: <br/>
    - Marcar o vértice w <br/>
