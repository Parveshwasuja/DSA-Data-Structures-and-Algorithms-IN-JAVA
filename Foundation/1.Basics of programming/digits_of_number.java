import java.util.*;
import java.lang.*;
    
    public class digits_of_number{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=n;
        //1st method
        // String s = String.valueOf(n);
        
        // for(int i=0;i<s.length();i++){
        //     System.out.println(s.charAt(i));
        // }
        
        
        //2nd method
        int nod=0;
        while(n!=0){
            n=n/10;
            nod++;
        }
        nod = (int)Math.pow(10,nod-1);
        while(nod!=0){
            int digit = a/nod;
            System.out.println(digit);
            a = a%nod;
            nod/=10;
        }
        
        
          
     }
    }