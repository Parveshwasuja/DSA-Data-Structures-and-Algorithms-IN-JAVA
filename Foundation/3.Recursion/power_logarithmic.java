import java.io.*;
import java.util.*;

public class power_logarithmic {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(power(x,y));
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }else{
            if(n%2==0){
                int t = power(x,n/2);
                return t*t;
            }else{
                int t = power(x,(n-1)/2);
                return x*t*t;
            }
        }
    }


}
