import java.io.*;
import java.util.*;

public class rotate_matrix_by_90 {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        int z=n/2;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
            for(k=0;k<z;k++){
                int temp = a[i][k];
                a[i][k] = a[i][n-1-k];
                a[i][n-1-k] = temp;
            }
        }
        display(a);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}