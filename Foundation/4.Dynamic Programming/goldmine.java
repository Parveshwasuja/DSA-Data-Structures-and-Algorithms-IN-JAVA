import java.io.*;
import java.util.*;

public class goldmine {

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
        
        int max1 = total1(a);
        System.out.println(max1);
    }
    
    public static int total1(int[][] arr){
        
        int[][] dp = new int[arr.length][arr[0].length];
        
        int i,j;
        
        for(i=dp[0].length-1;i>=0;i--){
            for(j=dp.length-1;j>=0;j--){
                
                if(i==dp[0].length-1){
                    dp[j][i]=arr[j][i];
                }else if(j==dp.length-1){
                    dp[j][i] = Math.max(dp[j-1][i+1],dp[j][i+1]) + arr[j][i];
                }else if(j==0){
                    dp[j][i] = Math.max(dp[j][i+1],dp[j+1][i+1]) + arr[j][i];
                }else{
                    dp[j][i] = Math.max(Math.max(dp[j-1][i+1],dp[j][i+1]),dp[j+1][i+1]) + arr[j][i];
                }
                
            }
        }
        int max1 = Integer.MIN_VALUE;
        for(i=0;i<dp.length;i++){
            max1 = Math.max(max1,dp[i][0]);
        }
        return max1;
        
    }

}