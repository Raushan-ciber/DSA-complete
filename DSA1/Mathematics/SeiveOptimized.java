package DSA1.Mathematics;
import java.util.*;
public class SeiveOptimized {

    public static void printprime(int n){
        boolean isprime[]  = new boolean[n+1];
        Arrays.fill(isprime, true);
        for(int i=2;i<=n;i++){
            if(isprime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i){
                    isprime[j]=false;
                }
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printprime(n);
        sc.close();
    }
}
