## Busca em Profundidade 
Critério de escolha do vértice: dentre todos os vértices marcados e incidentes a alguma aresta ainda não explorada, escolher aquele mais recentemente alcançado na busca

### Definições: 
- Cada vértice é inicialmente desmarcado (ou branco)
- Ele se torna marcado (ou cinza) quando for descoberto 
- E se torna explorado (ou preto) quando sua lista de adjacências for completamente examinada

![image](https://user-images.githubusercontent.com/89612369/226170013-c13f3678-ccb9-4574-9744-8d8c30fcd306.png)

### Atributos: 
- Cada vértice possui 2 valores atrelados: 
   - tempo de descoberta = quando ele foi visitado pela primeira vez
   - tempo de término = quando ele foi completamente explorado <br/>
![image](https://user-images.githubusercontent.com/89612369/226172049-b79bc24e-5ebf-42fd-9593-934f456309c7.png)
- Contador global: incrementado toda vez que um novo vértice é descoberto e quando algum vértice é completamente explorado 
- Quando um vértice w for descoberto a partir de um vértice v, o pai de w será v -> pai[w]=v <br/>
![image](https://user-images.githubusercontent.com/89612369/226172196-b5cf8660-545c-41f9-97ac-a7f3e38a5013.png)

### Algoritmo
1. t = 0     // inicializar tempo global 
2. para todo vértice v do grafo, faça: 
  a. TD[v] = 0     // inicializar tempo de descoberta
  b. TT[v] = 0     // inicializar tempo de término 
  c. pai[v] = null      // inicializar predecessor/pai 
3. enquando existir algum v tal que TD[v] = 0, faça:
  buscaProfundidade(v);     // executar busca para raiz v 

## Busca em Profundidade - Grafo Não Direcionado 
- aresta de árvore: quando a aresta {v, w} é usada para visitar w pela primeira vez 
- aresta de retorno: quando w já foi descoberto, mas ele não é pai de v na busca

### buscaProfundidade(v)
1. t = t+1;     // definir tempo de descoberta
2. para todo vértice w vizinho a v, faça:     // para toda a vizinhança de v 
  a. se TD[w] = 0, então:     // se w é visitado pela primeira vez 
      - visitar aresta {v, w};     // {v, w} é aresta de árvore 
      - pai[w] = v;
      - buscaProfundidade(w);
  b. senão, se TT[w] = 0 e w "= pai[v], então:     // se w for ancestral mas não pai 
      - visitar aresta {v, w}     // {v, w} é aresta de retorno 
3.  t = t + 1     // definir tempo de término 
4.  TT[v] = t

#### Custo da busca = O(n + m), em que n = |V(G)| e m = |E(G)| 

Exemplo: 
![image](https://user-images.githubusercontent.com/89612369/226173568-8cf2220d-ef53-4bb4-9b0a-0e7494cdc1cc.png)

