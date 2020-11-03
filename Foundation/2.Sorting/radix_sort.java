import java.io.*;
import java.util.*;

public class radix_sort {

  public static void radixSort(int[] arr) {
    
    int max = Integer.MIN_VALUE;
    for(int val : arr){
        if(val>max){
            max = val;
        }
    }
    int exp=1;
    while(exp<=max){
        countSort(arr,exp);
        exp = exp*10;
    }
    
    
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
        int[] freq = new int[10];
        int i,j;
        Arrays.fill(freq,0);
        for(i=0;i<arr.length;i++){
            freq[arr[i]/exp % 10]++;
        }
        int[] prefix = new int[10];
        prefix[0]=freq[0]-1;
        for(i=1;i<10;i++){
            prefix[i] = prefix[i-1] + freq[i];
        }
        
        int[] ans = new int[arr.length];
        for(i=arr.length-1;i>=0;i--){
            int z = prefix[arr[i]/exp %10];
            ans[z] = arr[i];
            prefix[arr[i]/exp %10]--;
        }
        for(i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        
    
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}