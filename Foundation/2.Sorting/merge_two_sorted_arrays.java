import java.io.*;
import java.util.*;

public class merge_two_sorted_arrays {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    
    int l1 = a.length;
    int l2 = b.length;
    int l=l1+l2;
    int[] c = new int[l1+l2];
    int i,j,k=0;
    i=0;j=0;
    while(i<l1 && j<l2){
        if(a[i]<b[j]){
            c[k++] = a[i++];
        }else{
            c[k++] = b[j++];
        }
    }
    while(i<l1){
        c[k++] = a[i++];
    }
    while(j<l2){
        c[k++] = b[j++];
    }
    return c;
    
    //return null;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}