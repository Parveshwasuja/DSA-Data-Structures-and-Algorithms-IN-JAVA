import java.io.*;
import java.util.*;

public class diff_of_array{

public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int a[]=new int[n1];
    
    
    int i,j;
    for(i=0;i<n1;i++){
        a[i]=sc.nextInt();
    }
    int n2 = sc.nextInt();
    int b[]=new int[n2];
    for(i=0;i<n2;i++){
        b[i]=sc.nextInt();
    }
    
    if(n2>=n1){
        int br=0;
        i=n1-1;
        j=n2-1;
        int []e = new int[n2];
        int k=n2-1;
        
        while(i>=0 || j>=0){
            int c=0,d=0;
            if(i>=0){
                c=a[i];
            }
            if(j>=0){
                d=b[j];
            }
            if(d-br<c){
                e[k] = (d-br+10-c);
                
                br=1;
            }else{
                e[k] = (d-br-c);
                
                br=0;
            }
            i--;
            j--;
            k--;
        }
        
            int flg=1;
            for(j=0;j<n2;j++){
                if(e[j]==0  &&  flg==1){
                    continue;
                }else{
                    flg=0;
                    System.out.println(e[j]);
                }
            }
        
        
    }
    
 }

}