import java.io.*;
import java.util.*;

public class flood_fill {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        //visited[0][0]=true;
        
        floodfill(a,0,0,"",visited);
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited){
        
        if(row<0 || row==maze.length || col<0 || col==maze[0].length || 
        maze[row][col]==1 || visited[row][col]==true){
            return;
        }
        
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(psf);
            return;
        }
        
        visited[row][col]=true;
        floodfill(maze,row-1,col,psf+"t",visited);
        floodfill(maze,row,col-1,psf+"l",visited);
        floodfill(maze,row+1,col,psf+"d",visited);
        floodfill(maze,row,col+1,psf+"r",visited);
        visited[row][col]=false;
        
    }
}