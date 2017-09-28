package Exemple_Nazzi;

public class example {
    static int[] cycleElements;
    static int cycleElementsIndex = 0;
    static boolean cycleFound = false;
    static final int NEW = 0;
    static final int PUSHED = 1;
    static final int POPPED = 2;
    public static int findCycle(int [][] graph, int N, int u, int [] states){
        for (int v = 0; v < N ; v++) {
            if(graph[u][v] == 1){
                if(states[v] == PUSHED){
                    cycleFound = true;
                    return v;
                }else if (states [v] == NEW){
                    states[v] = PUSHED;
                    int poppedVertex = findCycle(graph, N, v, states);
                    states[v] = POPPED;
                    if(cycleFound){
                        if (poppedVertex == u) {
                         cycleElements[cycleElementsIndex++] = v;
                         cycleElements[cycleElementsIndex++] = u;
                         cycleFound = false;
                        }else{
                            cycleElements[cycleElementsIndex++]= v;
                            return poppedVertex;
                        }
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int N = 6;
        int [][] graph = {    {0,1,0,0,0,0,0,0},
                              {0,0,1,0,0,0,0,0},
                              {0,0,0,1,1,0,0,0},
                              {0,0,0,0,0,0,0,0},
                              {0,0,0,0,0,0,0,1},
                              {0,1,0,0,0,0,0,0},
                              };
        cycleElements = new int[N];
        int[] states = new int[N];
        states[0] = PUSHED;
        findCycle(graph,N,0,states);
        for(int i = 0; i< cycleElementsIndex; i++){
            System.out.println(cycleElements[i]);
        }
    }
}
