package DSA1.Mathematics;
import java.util.*;

public class FactorialN {
    public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
       return n * findFactorial(n-1);
    }
    
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
<<<<<<< HEAD
        System.out.print(findFactorial(n)); 
        //for(int i=1;i<=n;i++){
        //    factorial = factorial*i;
        //}
        //System.out.print(factorial);
        sc.close();
=======
        int factorial =1;
        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.print(factorial);
>>>>>>> 2796c7887f0463f132031f3e11e90c5d3f7546d4
    }
}
