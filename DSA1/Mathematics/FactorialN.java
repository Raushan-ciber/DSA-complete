package DSA1.Mathematics;
import java.util.*;

public class FactorialN {
    public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
       return n * findFactorial(n-1);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findFactorial(n)); 
        //for(int i=1;i<=n;i++){
        //    factorial = factorial*i;
        //}
        //System.out.print(factorial);
        sc.close();
    }
}
