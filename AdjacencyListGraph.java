
import java.io.*;
import java.util.*;

public class AdjacencyListGraph {
    
        LinkedList< Integer > graph[] ;
        int size = 0 ;
        public AdjacencyListGraph(int size ){
            this.size = size;
            graph = new LinkedList[ size ];
            for( int i = 0 ; i < size ; i++ )
                graph[i]= new LinkedList<>();
        }
        public static void printGraph(AdjacencyListGraph A){
            for(int i=0; i<A.size; i++){
                System.out.print( i);
            for( Integer j  : A.graph[ i ] )
                System.out.print( " -> " +j);
            System.out.println();
        }
        }
    public static void add(AdjacencyListGraph A, int source, int destination ){
        A.graph[ source ].add( destination );
        A.graph[ destination ].add( source );
    }
    }

