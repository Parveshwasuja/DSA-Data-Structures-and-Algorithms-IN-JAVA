import java.io.*;
import java.util.*;

public class rotate_array{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a,int start,int end){
    int i;
    int mid = (end-start+1)/2 + start;
    int j=0;
    for(i=start;i<mid;i++){
        int temp = a[i];
        a[i] = a[end-j];
        a[end-j] = temp;
        j++;
    }

  }

  public static void rotate(int[] a, int k){
    // write your code here
        int l = a.length;
        k = k%l;
        if(k<0){
            k = k + l;
        }
        int i,j=0;

        reverse(a,0,l-1-k);
        reverse(a,l-k,l-1);
        reverse(a,0,l-1);
 
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}