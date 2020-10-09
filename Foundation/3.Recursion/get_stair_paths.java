import java.io.*;
import java.util.*;

public class get_stair_paths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> a = getStairPaths(n);
        System.out.println(a);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }else if(n<0){
            ArrayList<String> a = new ArrayList<>();
            return a;
        }
        
        ArrayList<String> arr1 = getStairPaths(n-1);
        ArrayList<String> arr2 = getStairPaths(n-2);
        ArrayList<String> arr3 = getStairPaths(n-3);
        
        ArrayList<String> nlst = new ArrayList<>();
        for(String i : arr1){
            nlst.add('1'+i);
        }
        for(String i : arr2){
            nlst.add('2'+i);
        }
        for(String i : arr3){
            nlst.add('3'+i);
        }
        return nlst;
        
    }

}