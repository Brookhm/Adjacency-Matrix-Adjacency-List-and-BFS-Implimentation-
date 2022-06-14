
public class Dijkstra {
    private static void dijkstra(int[][] adjacencyMatrix){
        int v= adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0]=0;
        for(int i=1; i<v; i++){
            distance[i]=Integer.MAX_VALUE;
        }
        for(int i=0; i<v; i++){
            int minV= findMinV(distance, visited);
            visited[minV]= true;
            for(int j=0; j<v; j++){
                if(adjacencyMatrix[minV][j] !=0 && !visited[j] && distance[minV]!= Integer.MAX_VALUE){
                    int newDist = distance[minV] + adjacencyMatrix[minV][j];
                    if(newDist<distance[j]){
                        distance[j]=newDist;
                    }
                }
            }
        }
            for(int i = 0; i<v; i++){
                System.out.println(i + " " + distance[i]);
            }
    }
    private static int findMinV(int[]distance, boolean visited[]){
        int minV= -1;
        for(int i = 0; i< distance.length; i++){
            if(!visited[i] && (minV== -1 || distance[i]< distance[minV])){
                minV=i;
            }
        }
        return minV;
    }
    
}
