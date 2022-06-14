
import java.util.Scanner;

public class Test {
    
    

    
    public static void main(String[] args) {
            Scanner e = new Scanner( System.in );
		  System.out.println(" Enter the Size of the graph ");
		  
		  int size =e.nextInt();
		  AdjacencyListGraph A= new AdjacencyListGraph(size);
		  
		  for(int i = 0 ; i < size ; i++){
			  System.out.println( "Enter v and w ");
			   int src = e.nextInt();
			   int dest = e.nextInt();
		  A.add( A, src,dest );									
		  }
		  System.out.println( "The undirected graph is \n ");
		  A.printGraph(A); 
                  
        AdjacencyMatrix binary = new AdjacencyMatrix(2);
        binary.dispGraph();
        binary.initgraph();
        binary.dispGraph();
        
        BFS beasts = new BFS(5);
        beasts.addTheEdge(0, 1);
        beasts.addTheEdge(0, 2);
        beasts.addTheEdge(1, 2);
        beasts.addTheEdge(2, 0);
        beasts.addTheEdge(2, 3);
        beasts.addTheEdge(3, 0);
        beasts.addTheEdge(3, 1);
        beasts.addTheEdge(3, 2);
        beasts.addTheEdge(3, 4);
        beasts.addTheEdge(4, 4);
        beasts.BFS(1);
        System.out.println("=>Breadth First Traversal " + "(starting from the first vertex)");
        
        
        DFS dfs = new DFS(5);
        dfs.addTheEdge(0, 1);
        dfs.addTheEdge(0, 2);
        dfs.addTheEdge(1, 2);
        dfs.addTheEdge(2, 0);
        dfs.addTheEdge(2, 3);
        dfs.addTheEdge(3, 0);
        dfs.addTheEdge(3, 1);
        dfs.addTheEdge(3, 2);
        dfs.addTheEdge(3, 4);
        dfs.addTheEdge(4, 4);
        dfs.DFS(1);
        System.out.println("=>Depth First Traversal " + "(starting from the first vertex)");
        
        
        
        System.out.println(" Enter the weight of the graph ");
        Scanner s= new Scanner(System.in);
             int v= s.nextInt();
             int c= s.nextInt();
             int adjacncyMatrix[][]= new int[v][v];
             for(int i=0; i<c; i++){
                 int v1= s.nextInt();
                 int v2= s.nextInt();
                 int weight = s.nextInt();
                 adjacncyMatrix[v1][v2] = weight;
                 adjacncyMatrix[v2][v1] = weight;
             }
             dijkstra(adjacncyMatrix);
    
        
        
                            
     
    }

    private static void dijkstra(int[][] adjacncyMatrix) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
