import java.util.*;
  
  public class any_base_subtraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       
       // write your code here
       int br=0,rv=0,temp=1;
       while(n1!=0 || n2!=0 || br!=0){
           
           int d = n2%10;
           int c = n1%10;
           
           if(d-br < c){
               rv = rv + (((d-br)+b)-c)*temp;
               br=1;
           }else{
               rv = rv + ( (d-br)-c)*temp;
               br=0;
           }
           n1=n1/10;
           n2=n2/10;
           temp = temp*10;
        
       }
       return rv;
       
   }
  
  }