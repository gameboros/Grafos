
import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String entrada = in.nextLine();
        Grafo grafo = new Grafo();

        grafo = leArquivo(entrada);
        int v = -1;
        while (v != 0) {
            System.out.println("----------------------------");
            System.out.println("Digite o valor do vértice: ");
            v = in.nextInt();
            in.nextLine();
            Vertice vertice = new Vertice(v);
            /*
             * (i) grau de saída
             * (ii) grau de entrada
             * (iii) conjunto de sucessores
             * (iv) conjunto de predecessores
             */
            
            if (grafo.containsVertice(vertice)) {
                // Grau de saída do vértice == numero de arestas que saem do vertice 
                int n = vertice.getQuantVizinhos();
                System.out.println(n);


                // Grau de saída do vértice == numero de arestas que saem do vertice 
                System.out.println("Grau de saída: " + vertice.getVizinhos().size()); 

                // Grau de entrada == numero de arestas que entram no vertice
                System.out.println("Grau de entrada: " + grafo.countVizinhos(vertice)); 
                ArrayList<Vertice> sucessores = vertice.getVizinhos();

                // Sucessores == vertices que saem do vertice
                System.out.print("Sucessores: "); 
                for(Vertice aux: sucessores) {
                    System.out.print(aux.getId());
                }
                System.out.println();

                // Predecessores == vertices que chegam ao vertice
                System.out.println("Predecessores: " ); 

            } else {
                System.out.println("Vértice inválido!");
            }
        }
        in.close();

    }

    private static Grafo leArquivo(String entrada) throws FileNotFoundException {
        File arquivo = new File(entrada);
        //File arquivo = new File("graph-test-100.txt");
        Scanner sc = new Scanner(arquivo);
        int vertices = sc.nextInt();
        int arestas = sc.nextInt();
        int v, a;

        Grafo grafo = new Grafo();
        while(sc.hasNext()) {
            v = sc.nextInt();
            a = sc.nextInt();
            Vertice vertice = new Vertice(v);
            Vertice aresta = new Vertice(a);
            if (grafo.containsVertice(vertice)) {
                grafo.addVizinho(vertice, aresta);
                System.out.println("aresta " + vertice.getId() + " " + aresta.getId());
            } else {
                grafo.addVertice(vertice, aresta);
                System.out.println("vertice " + vertice.getId() + " " + aresta.getId());
            }
        }
        sc.close();
        return grafo; 
    }

    
}

class Grafo {
    private ArrayList<Vertice> vertices;
    private int numVertices = 0; 

    public Grafo() {
        vertices = new ArrayList<Vertice>();
    }

    public void addVertice(Vertice v, Vertice a) {
        vertices.add(v);
        v.addVizinho(a);
        numVertices++;
    }

    public void addVizinho(Vertice v1, Vertice v2) {
        v1.addVizinho(v2);
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public boolean containsVertice(Vertice v) {
        boolean resp = false; 
        for (Vertice vertice : vertices) {
            if (vertice.getId() == v.getId()) {
                resp = true;
            }
        }
        return resp;
    }


    public ArrayList<Vertice> countVizinhos(Vertice v) {
         
        ArrayList<Vertice> aux = new ArrayList<>();
        for(Vertice vertice: vertices) {
            if(vertice.getId() == v.getId()) {
                aux = vertice.getVizinhos();
            }
        }
        return aux; 
    }

    
}

class Vertice {
    private int id;
    private ArrayList<Vertice> vizinhos;
    private int quantVizinhos = 0; 


    public Vertice(int id) {
        this.id = id;
        vizinhos = new ArrayList<Vertice>();
    }

    public void addVizinho(Vertice v) {
        vizinhos.add(v);
        quantVizinhos++;
    }

    public int getId() {
        return id;
    }

    public int getQuantVizinhos() {
        return quantVizinhos;
    }

    public ArrayList<Vertice> getVizinhos() {
        return vizinhos;
    }
    
}
