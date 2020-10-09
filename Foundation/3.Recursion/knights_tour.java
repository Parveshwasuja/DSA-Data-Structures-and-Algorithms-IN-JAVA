import java.io.*;
import java.util.*;

public class knights_tour {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess,row,col,1);
        
    }

    public static void printKnightsTour(int[][] chess, int row,int col,int mov) {
        
        
        if(row<0 || row >= chess.length || col<0 || col >=chess.length
        ||  chess[row][col]>0){
            return;
        }else if(mov==chess.length*chess.length){
            chess[row][col]=mov;
            displayBoard(chess);
            chess[row][col]=0;
            return;
        }
        
        chess[row][col]=mov;

        printKnightsTour(chess,row-2,col+1,mov+1);
        printKnightsTour(chess,row-1,col+2,mov+1);
        printKnightsTour(chess,row+1,col+2,mov+1);
        printKnightsTour(chess,row+2,col+1,mov+1);
        
        printKnightsTour(chess,row+2,col-1,mov+1);
        printKnightsTour(chess,row+1,col-2,mov+1);
        printKnightsTour(chess,row-1,col-2,mov+1);
        printKnightsTour(chess,row-2,col-1,mov+1);
        chess[row][col]=0;
        
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}