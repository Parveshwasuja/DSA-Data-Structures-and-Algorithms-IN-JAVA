import java.io.*;
import java.util.*;

public class permutations_of_string_iterative {

	public static void solution(String str){
		
		int l=str.length();
		
		int i,j,temp;
		int n = factorial(l);
		//System.out.println(n);
		for(i=0;i<n;i++){
		    StringBuilder sb = new StringBuilder(str);
		    temp=i;
		    for(int div=l;div>=1;div--){
		        
		        int q = temp/div;
		        int r = temp%div;
		        
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        
		        temp=q;
		        
		    }
		    System.out.println();
		    
		}
		
	}
	
	public static int factorial(int n){
	    int i,fact=1;
	    for(i=2;i<=n;i++){
	        fact = fact*i;
	    }
	    return fact;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}