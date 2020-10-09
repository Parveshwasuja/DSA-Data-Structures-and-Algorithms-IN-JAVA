import java.io.*;
import java.util.*;

public class print_kpc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printKPC(s,"");
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str,String ans) {
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        
        char ch = str.charAt(0);
        int idx = ch - 48;
        String ros = str.substring(1);
        for(int i=0;i<codes[idx].length();i++){
            printKPC(ros,ans+codes[idx].charAt(i));
        }
        
    }

}