import java.io.*;
import java.util.*;

public class ceil_floor{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int i;
    int [] a = new int[n];
    for(i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    int x = sc.nextInt();
    
    int l=0,h=n-1,ceil=0,floor=0,flg=0;
    while(l<=h){
        int mid = (l+h)/2;
        
        if(a[mid]==x){
            ceil = x;
            floor = x;
            flg=1;
            break;
        }else if(a[mid]<x){
            l = mid + 1;
            ceil = a[mid];
        }else{
            h = mid - 1;
            floor = a[mid];
        }
    }
    
        System.out.println(floor);
        System.out.println(ceil);
    
    
}

}