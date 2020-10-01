import java.io.*;
import java.util.*;

public class shell_rotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        int i,j;
        
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        int row=n,col=m;
        
        row = row - 2*(s-1);
        col = col - 2*(s-1);
        int te = (row*col) - ((row-2)*(col-2));
        r = r%te;
        if(r<0){
            r = r+te;
        }
        int p,q;
        int sc=s-1,sr=s-1;
        int lc = sc+col-1;
        int lr = sr+row-1;
        while(r>0){
            int prev = a[sr][lc],temp;
            for(p=lc-1;p>sc;p--){
                temp = a[sr][p];
                a[sr][p] = prev;
                prev = temp;
            }
            
            for(p=sr;p<lr;p++){
                temp = a[p][sc];
                a[p][sc] = prev;
                prev = temp;
            }
            for(p=sc;p<lc;p++){
                temp = a[lr][p];
                a[lr][p] = prev;
                prev = temp;
            }
            for(p=lr;p>=sr;p--){
                temp = a[p][lc];
                a[p][lc] = prev;
                prev = temp;
            }
          r--;  
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