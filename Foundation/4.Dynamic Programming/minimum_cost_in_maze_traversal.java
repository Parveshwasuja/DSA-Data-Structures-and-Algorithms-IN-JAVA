import java.io.*;
import java.util.*;

public class minimum_cost_in_maze_traversal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int[][] store = new int[n+1][m+1];
        for(int[] row : store){
            Arrays.fill(row,-1);
        }
        //Arrays.fill(store,-1);
        int res = total(a,0,0,store);
        System.out.println(res);
        
    }
    
    public static int total(int[][] arr,int row,int col,int[][] store){
        
        if(row>=arr.length || col>=arr[0].length || col<0 || row<0){
            return -2; 
        }
        
        if(store[row][col]!=-1){
            return store[row][col];
        }
        int a = total(arr,row,col+1,store);
        int b = total(arr,row+1,col,store);
        if(b==-2){
            b=Integer.MAX_VALUE;
        }
        if(a==-2){
            a=Integer.MAX_VALUE;
        }
        int c = Math.min(a,b);
        if(c!=Integer.MAX_VALUE){
            c = c + arr[row][col];
        }else{
            c = arr[row][col];
        }
        store[row][col]=c;
        return c;
        
    }

}