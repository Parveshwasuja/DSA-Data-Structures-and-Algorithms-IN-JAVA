import java.io.*;
import java.util.*;

public class get_subsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> a = gss(s);
        System.out.println(a);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rss = gss(ros);
        
        ArrayList<String> nls = new ArrayList<>(); 
        for(String i : rss){
            nls.add("" + i);
        }
        for(String i : rss)
            nls.add(ch + i);
        return nls;
        
    }

}