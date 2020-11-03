import java.io.*;
import java.util.*;

public class fib_dp{

public static int fib(int n,int[] store){
    if(n==0 || n==1)return n;
    
    if(store[n]!=0){
        return store[n];
    }
    
    int fib1 = fib(n-1,store);
    int fib2 = fib(n-2,store);
    int c = fib1 + fib2;
    store[n]=c;
    return c;
}
public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int[] a = new int[n+1];
        int f = fib(n,a);
        System.out.println(f);
        
 }

}