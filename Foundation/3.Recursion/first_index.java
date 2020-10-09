import java.io.*;
import java.util.*;

public class first_index {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstIndex(a,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==x){
            return idx;
        }else{
            return firstIndex(arr,idx+1,x);
        }
    }

}