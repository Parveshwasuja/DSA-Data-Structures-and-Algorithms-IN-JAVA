import java.io.*;
import java.util.*;

public class bar_graph{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j;
    int  a[] = new int[n];
    int max = Integer.MIN_VALUE;
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
        if(a[i]>max){
            max=a[i];
        }
    }
    int sp=max;
    for(i=0;i<max;i++){
        for(j=0;j<n;j++){
            
            if(a[j]<sp){
                System.out.print("\t");
            }else{
                System.out.print("*\t");
            }
            
        }
        sp--;
        System.out.print("\n");
        
    }
 }

}