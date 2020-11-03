import java.io.*;
import java.util.*;

public class sort_dates {

  public static void sortDates(String[] arr) {
    
        countSort(arr,1000000,100,32);
        countSort(arr,10000,100,13);
        countSort(arr,1,10000,2501);
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
        
        int[] freq = new int[range];
        int i,j;
        Arrays.fill(freq,0);
        for(i=0;i<arr.length;i++){
            freq[Integer.parseInt(arr[i],10)/div % mod]++;
        }
        for(i=1;i<range;i++){
            freq[i] = freq[i-1] + freq[i];
        }
        
        String[] ans = new String[arr.length];
        for(i=arr.length-1;i>=0;i--){
            int z = freq[Integer.parseInt(arr[i],10)/div % mod];
            //z--;
            ans[z-1] = arr[i];
            freq[Integer.parseInt(arr[i],10)/div % mod]--;
        }
        for(i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
        
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}