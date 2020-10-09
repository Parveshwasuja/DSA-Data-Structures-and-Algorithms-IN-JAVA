import java.io.*;
import java.util.*;

public class target_sum_subsets {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int tar;
        tar = sc.nextInt();
        printTargetSumSubsets(a,0,"",0,tar);
        
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        
        if(idx==arr.length){
            if(sos==tar){
                System.out.println(set+".");
            }
            return;
        }
        
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+", ",sos+arr[idx],tar);
        printTargetSumSubsets(arr,idx+1,set,sos,tar);
    }

}