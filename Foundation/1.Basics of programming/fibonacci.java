import java.util.*;
  
  public class fibonacci{
  
  public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        if(n==1){
            System.out.println();
        }
        if(n==2){
            System.out.println(a);
            System.out.println(b);
        }
        if(n>=3){

            System.out.println(a);
            System.out.println(b);
            for(int i=3;i<=n;i++){
                a = a+b;
                System.out.println(a);
                b = a+b;
                a = b-a;
                b = b-a;
            }
        }
   }
  }