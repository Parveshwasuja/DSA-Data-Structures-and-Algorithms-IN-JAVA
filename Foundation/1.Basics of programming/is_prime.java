import java.util.*;
  
  public class is_prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      while(t-->0){
          int n = scn.nextInt();
          int flag=0;
          int z = (int)Math.sqrt(n);
          for(int i=z;i>1;i--){
              if( n%i == 0){
                  flag=1;
                  break;
              }
          }
          if(flag==1){
              System.out.println("not prime");
          }else{
              System.out.println("prime");
          }
          
      }
  
       
  
   }
  }