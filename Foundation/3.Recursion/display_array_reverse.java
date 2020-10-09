import java.io.*;
import java.util.*;

public class display_array_reverse {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        displayArrReverse(a,0);
    }


    public static void displayArrReverse(int[] arr, int idx) {
        if(idx>=arr.length){
            return;
        }
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }

}