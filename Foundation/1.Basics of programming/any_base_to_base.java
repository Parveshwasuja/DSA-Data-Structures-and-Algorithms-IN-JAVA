import java.util.*;
  
  public class any_base_to_base{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     int decimal = fun(n,sourceBase);
     //System.out.println(decimal);
     int res = convert(decimal,destBase);
     System.out.println(res);
   } 
   public static int fun(int n,int b){
       int temp=1;
       int rv =0;
       while(n!=0){
           int z = n%10;
           rv = rv + temp*z;
           temp=temp*b;
           n=n/10;
       }
       return rv;
   }
   
   public static int convert(int n,int b){
       int rv=0;
       int temp=1;
       while(n!=0){
           int z = n%b;
           rv= rv+z*temp;
           temp=temp*10;
           n=n/b;
       }
       return rv;
   }
  }