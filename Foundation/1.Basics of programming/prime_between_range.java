import java.util.*;

public class prime_between_range{
    
    public static void myfun(int n ,int[] prime){

		//int[] prime = new int[n+1];
		Arrays.fill(prime,1);
		prime[0]=0;
		prime[1]=0;
		int z = (int)Math.sqrt(n);
		for(int i=2;i<=z;i++){

			if(prime[i]==1){
				for(int j=i;j<=n;j=j+i){
					prime[j]=0;
				}
			}
		
		}

	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        int[] prime = new int[high+1];
        myfun(high,prime);
        for(int i=low;i<=high;i++){
            if(prime[i]==1){
                System.out.println(i);
            }
        }
    }
}