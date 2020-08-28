import java.io.*;
import java.util.*;

public class first_last_index{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int []a = new int[n];
    int i;
    for(i=0;i<n;i++){a[i]=sc.nextInt();}
    int x = sc.nextInt();
    int l=0,h=n-1;
    int ind=-1;
    while(l<=h){
        int mid = (l+h)/2;
        if(a[mid]==x){
            ind = mid;
            break;
        }else if(a[mid]<x){
            l = mid+1;
        }else{
            h = mid-1;
        }
    }
    if(ind!=-1){
        int temp=1;
        int z=ind;
        while(z<n && a[z]==x){
            temp=temp*2;
            z = z + temp;
        }
        if(z>=n){
            z=n-1;
        }
        while(a[z]!=x){
            z--;
        }
        int lind = z;
        
        temp=1;
        z=ind;
        while(z>=0 && a[z]==x){
            temp=temp*2;
            z=z-temp;
        }
        if(z<0){
            z=0;
        }
        while(a[z]!=x){
            z++;
        }
        int find=z;
        System.out.println(find);
        System.out.println(lind);
    }
 }

}