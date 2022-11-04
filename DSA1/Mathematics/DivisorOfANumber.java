package DSA1.Mathematics;
import java.util.*;
public class DivisorOfANumber {
    //Naive solution
    public static void printAllDivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+ " ");
            }
        }
    }
    //Efficient solution
    public static void EfficientSolutionForPrintDivisor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printAllDivisor(n);
        EfficientSolutionForPrintDivisor(n);
        sc.close();
    }
}
