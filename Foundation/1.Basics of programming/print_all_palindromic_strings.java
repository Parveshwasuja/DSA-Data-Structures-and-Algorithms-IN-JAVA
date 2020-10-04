import java.io.*;
import java.util.*;

public class print_all_palindromic_strings {

	public static void solution(String str){
    	int l = str.length();
    	int i,j;
    	
    	for(i=0;i<l;i++){
    	    for(j=i+1;j<=l;j++){
    	        String s = str.substring(i,j);
    	        if(palindrome(s)==true){
    	            System.out.println(s);
    	        }
    	    }
    	}
		
	}
	public static boolean palindrome(String str){
	    int l = str.length();
	    int i;
	    for(i=0;i<l/2;i++){
	        if(str.charAt(i)!=str.charAt(l-1-i)){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}