import java.io.*;
import java.util.*;

public class last_index {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(lastIndex(a,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        int li = lastIndex(arr,idx+1,x);
        if(li!=-1){
            return li;
        }else{
            if(arr[idx]==x){
                return idx;
            }
            return li;
        }
        
    }
    

}