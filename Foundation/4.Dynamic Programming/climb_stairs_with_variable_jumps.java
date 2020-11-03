import java.io.*;
import java.util.*;

public class climb_stairs_with_variable_jumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int t = total(n,a,0,new int[n+1]);
        System.out.println(t);
    }
    public static int total(int n,int[] arr,int i,int[] store){
        
        
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        if(store[n]!=0){
            return store[n];
        }
        
        int z = arr[i];
        int t=0;
        for(int j=1;j<=z;j++){
           t+=total(n-j,arr,i+j,store);
        }
        return t;
        
    }

}