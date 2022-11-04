package DSA1.Mathematics;
import java.util.*;
public class PrimeFacotorNaiveSolution {
    //this method is cheking whether a number is prime or not
    public static boolean isPrime(int i){
        if(i==1){
            return false;
        }
        if(i==2 || i==3){
            return true;
        }
        if(i%2==0 || i%3==0) {
            return false;
        }
        for(int j = 5;j*j<=i;j=j+6){
            if(i%j==0 || i%j+2==0){
                return false;
            }
        }
        return true;
    }
    // this method is finding prime factors of a number
    public static void factorsOfPrime(int n){
        for(int i =2;i<n;i++){
            if(isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorsOfPrime(n);
        sc.close();                                                                          
    }
}
