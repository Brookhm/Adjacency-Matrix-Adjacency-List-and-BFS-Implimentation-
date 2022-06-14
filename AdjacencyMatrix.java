
import java.util.Scanner;

public class AdjacencyMatrix {
    private int size;
    private int [][] matrix;
    private Scanner scanner;
    public AdjacencyMatrix(int numNodes){
        this.size = numNodes;
        this.matrix = new int[this.size][this.size];
        this.scanner = new Scanner(System.in);
    }
    public void initgraph(){
        for(int i=0;i<this.size; i++){
            for(int j=0;j<this.size;j++){
                System.out.println("Enter the cost between Node"+(i+1)+" and Node"+(j+1));
                this.matrix[i][j] = this.scanner.nextInt();
            }
        }
    }
    public void dispGraph(){
        for(int i=0;i<this.size;i++){
            for(int j=0;j<this.size;j++){
                System.out.print(this.matrix[i][j]);
            }
            System.out.print("");
        }
    }
}
            
        