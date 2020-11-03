import java.io.*;
import java.util.*;

public class climb_stairs {

    public static int total(int n,int[] store){
        
        if(n<0){
            return 0;
        }
        if(n==0 || n==1){
            return 1;
        }
        
        if(store[n]!=0)
            return store[n];
        
        int a = total(n-1,store);
        int b = total(n-2,store);
        int c = total(n-3,store);
        int d = a+b+c;
        store[n]=d;
        return d;
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = total(n,new int[n+1]);
        System.out.println(f);
        
    }

}