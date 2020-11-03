import java.io.*;
import java.util.*;

public class smallest_element_in_sorted_rotated_array {

  public static int findPivot(int[] arr) {
    int i=0,j=arr.length-1;
    int min=Integer.MAX_VALUE;
    
    while(i<=j){
        int mid = (i+j)/2;
        if(min>arr[mid]){
            min=arr[mid];
        }
        if(arr[mid]<arr[j]){
            j=mid-1;
        }else if(arr[mid]>arr[j]){
            i=mid+1;
        }else{
            break;
        }
    }
    return min;
    
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }

}