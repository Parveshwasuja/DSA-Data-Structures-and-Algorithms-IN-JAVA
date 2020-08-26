import java.util.*;
  
  public class benjamin_bulbs{
  
  public static void main(String[] args) {
    // write your code here 
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int temp=3;
        while(i<=n){
            
            System.out.println(i);
            i+=temp;
            temp+=2;
            
        }
    
   }
  }