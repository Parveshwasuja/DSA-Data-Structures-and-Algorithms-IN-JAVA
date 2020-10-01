import java.io.*;
import java.util.*;

public class exit_point_of_matrix {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        i=0;j=0;
        int previ=0,prevj=-1;
        while(i<n && j<m){
            if(a[i][j]==1){
                if(i==previ && j==prevj+1){
                    i++;
                    prevj++;
                    continue;
                }else if(i==previ+1 && j==prevj){
                    j--;
                    previ++;
                    continue;
                }else if(i==previ && j==prevj-1){
                    i--;
                    prevj--;
                    continue;
                }else{
                    j++;
                    previ--;
                    continue;
                }
            }else{
                if(i==previ && j==prevj+1){
                    j++;
                    prevj++;
                    continue;
                }else if(i==previ+1 && j==prevj){
                    i++;
                    previ++;
                    continue;
                }else if(i==previ && j==prevj-1){
                    j--;
                    prevj--;
                    continue;
                }else{
                    i--;
                    previ--;
                    continue;
                }
                
            }
        }
        if(i<0){
            i=0;
        }
        if(i>=n){
            i=n-1;
        }
        if(j<0){
            j=0;
        }
        if(j>=m){
            j=m-1;
        }
        System.out.println(i);
        System.out.println(j);
        
    }

}