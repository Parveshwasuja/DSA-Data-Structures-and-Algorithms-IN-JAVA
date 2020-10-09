import java.io.*;
import java.util.*;

public class print_permutations {

    public static void main(String[] args) throws Exception {
            
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printPermutations(s,"");
        
    }

    public static void printPermutations(String str,String ans) {
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            StringBuilder sb = new StringBuilder(str);
            char ch = sb.charAt(i);
            sb.deleteCharAt(i);
            printPermutations(sb.toString(),ans+ch);
        }
        
        
        
    }

}