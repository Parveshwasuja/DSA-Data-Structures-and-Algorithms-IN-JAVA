import java.io.*;
import java.util.*;

public class print_zigzag {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==1){
            System.out.print(n+" "+n+" "+n+" ");
            return;
        }else{
            System.out.print(n+" ");
            pzz(n-1);
            System.out.print(n+" ");
            pzz(n-1);
            System.out.print(n+" ");
        }
    }


}