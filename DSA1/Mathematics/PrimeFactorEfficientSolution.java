package DSA1.Mathematics;
import java.util.*;
public class PrimeFactorEfficientSolution {
    public static void findPrimeFactors(int n){
        if(n<=1){
            return ;
        }
        for(int i = 2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimeFactors(n);
        sc.close();
    }
}
