import java.io.*;
import java.util.*;

public class print_encodings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printEncodings(s,"");
    }
    
    static char[] codes = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    public static void printEncodings(String str,String ans) {
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        if(str.charAt(0)=='0'){
            return;
        }
        
        
        char ch = str.charAt(0);
        int t = ch - 48;
        String ros = str.substring(1);
        printEncodings(ros,ans+codes[t-1]);
        if(str.length()>=2){
           String ch2 = str.substring(0,2);
           int z = Integer.valueOf(ch2);
            if(z<=26){
                printEncodings(str.substring(2),ans+codes[z-1]);
            }
        }
        
        
    }

}