import java.util.*;

public class remove_primes{
    
    public static void solution(ArrayList<Integer> al){
        
        int i;
        for(i=0;i<al.size();i++){
            
            int val = al.get(i);
            if(isprime(val)==true){
                al.remove(i);
                i--;
            }
            
        }
        
    }
    
    public static boolean isprime(int n){
        
        int i;
        for(i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        ArrayList<Integer> a = new ArrayList<>();
        for(i=0;i<n;i++){
            int x = sc.nextInt();
            a.add(x);
        }
        solution(a);
        System.out.print(a);
    }
    
}