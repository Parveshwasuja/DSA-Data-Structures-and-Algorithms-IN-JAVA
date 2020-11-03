import java.io.*;
import java.util.*;

public class count_sort {

  public static void countSort(int[] arr, int min, int max) {
        
        //int l = max-min+1;
        //System.out.println(l);
        int[] freq = new int[max-min+1];
        int i,j;
        Arrays.fill(freq,0);
        for(i=0;i<arr.length;i++){
            freq[arr[i]-min]++;
        }
        int[] prefix = new int[max-min+1];
        prefix[0]=freq[0]-1;
        for(i=1;i<max-min+1;i++){
            prefix[i] = prefix[i-1] + freq[i];
        }
        
        int[] ans = new int[arr.length];
        for(i=arr.length-1;i>=0;i--){
            int z = prefix[arr[i]-min];
            ans[z] = arr[i];
            prefix[arr[i]-min]--;
        }
        for(i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}