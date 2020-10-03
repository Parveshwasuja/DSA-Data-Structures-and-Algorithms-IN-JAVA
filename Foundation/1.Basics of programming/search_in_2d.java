import java.io.*;
import java.util.*;

public class search_in_2d {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();
        i=0;j=n-1;
        while(i<n && j>=0){
            if(a[i][j]==x){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(a[i][j] > x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");

    }

}