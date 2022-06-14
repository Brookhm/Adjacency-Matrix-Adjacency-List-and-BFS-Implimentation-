
import java.io.*;
import java.util.*;

public class DFS {
    private int V; 
    private LinkedList<Integer> adj[];
    
    DFS(int v){
        V=v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
    void addTheEdge(int v,int w){
        adj[v].add(w);
       
    }
    void DFS(int v, boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n=i.next();
            if(!visited[n])
                DFS(n, visited);
        }
    }
    void DFS(int v){
        boolean visited[] = new boolean[V];
         DFS(v, visited);
    }
}
