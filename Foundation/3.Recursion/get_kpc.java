import java.io.*;
import java.util.*;

public class get_kpc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> a = getKPC(s);
        System.out.println(a);
    }
    static String[] codes = {".;" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};
    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0){
            ArrayList<String> ab = new ArrayList<>();
            ab.add("");
            return ab;
        }
        int ch = (int)str.charAt(0) - 48;
        String ros = str.substring(1);
        ArrayList<String> a = getKPC(ros);
        
        ArrayList<String> arr = new ArrayList<>();
        for(int j=0;j<codes[ch].length();j++){

            for(String i : a){
                arr.add(codes[ch].charAt(j)+i);
            }
            
        }
        
        return arr;
    }

}