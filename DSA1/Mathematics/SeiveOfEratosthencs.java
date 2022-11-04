package DSA1.Mathematics;
import java.util.*;
public class SeiveOfEratosthencs {
    //checking prime or not 
    public static boolean isprime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%i+2==0){
                return false;
            }
        }
        return true;
    }
    //printing all prime no 
    
    public static void printAllPrime(int n){
        for(int i= 1;i<=n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printAllPrime(n);
        sc.close();
    }
}
