import java.io.*;
import java.util.*;

public class n_queens {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess,"",0);
    }
    
    public static boolean issafe(int[][] chess,int row,int col){
        for(int i=0;i<chess.length;i++){
            if(i!=row && chess[i][col]==1){
                return false;
            }
        }
        int i,j;
        for(i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        for(i=row-1,j=col+1;i>=0 && j<chess[0].length;i--,j++){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        return true;
    }
    
    public static void printNQueens(int[][] chess, String qsf, int row) {
        
        if(row==chess.length){
            System.out.println(qsf+".");
            return;
        }
        
        for(int col=0;col<chess.length;col++){
            
            if(chess[row][col]==0 && issafe(chess,row,col)==true){
                chess[row][col]=1;
                printNQueens(chess,qsf+row+"-"+col+", ",row+1);
                chess[row][col]=0;
            }
            
        }
        
        
    }
}