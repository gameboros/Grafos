import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random(); // Gera numeros aleatorios   
        int[] tamanhos = {100, 1000, 4000}; // Tamanhos dos grafos a serem gerados       
        int tentativas = 10; // Numero de vezes que cada tamanho de grafo sera gerado e testado
        
        for (int tamanho : tamanhos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Grafo tamanho " + tamanho);
            double tempoTotal = 0;
            
            // Gera e testa o grafo aleatório 
            for (int i = 0; i < tentativas; i++) {
                Grafo g = geraGrafo(tamanho, rand);
                
                // Executa o algoritmo Tarjan e mede o tempo de execucao
                long inicio = System.nanoTime();
                Tarjan tarjan = new Tarjan(g);
                tarjan.getComponentesBiconexos();
                long fim = System.nanoTime();               
                double tempo = (fim - inicio) / 1000000.0; // Calcula o tempo que levou para executar o algoritmo em milissegundos
                tempoTotal += tempo;
            }           
            // Calcula o tempo médio que levou para executar o algoritmo em cada grafo do tamanho atual
            double tempoMedio = tempoTotal / tentativas;
            System.out.println("Tempo médio Tarjan: " + tempoMedio + " ms");
        }
    }
    
    // Gera um novo grafo aleatório com o tamanho especificado
    public static Grafo geraGrafo(int tamanho, Random rand) {
        Grafo g = new Grafo(tamanho);
        // Percorre cada par de vértices do grafo
        for (int i = 0; i < tamanho; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                // Adiciona uma aresta entre os vértices i e j com probabilidade de 50%
                if (rand.nextDouble() < 0.5) {
                    g.addAresta(i, j);
                }
            }
        }
        return g;
    }
}
