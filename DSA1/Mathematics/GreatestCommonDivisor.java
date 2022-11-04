package DSA1.Mathematics;

import java.util.*;

public class GreatestCommonDivisor {
    // public static int findGCD(int a, int b){
    // //Naive solution
    // int res = Math.min(a, b);
    // while(res>0){
    // if(a%res ==0 && b %res ==0){
    // break;
    // }
    // res--;
    // }
    // return res;
    // }

    // Euclidian algorithm
    // public static int findHcf(int a, int b){
    // while(a!=b){
    // if(a>b){
    // a = a-b;
    // }
    // else{
    // b = b-a;
    // }
    //
    // }
    // return a;
    //
    // }
 

    // most optimized approach
    public static int omptimizedGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return omptimizedGCD(b, a % b);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(omptimizedGCD(a,b));

        // System.out.print(findHcf(a,b));

        // System.out.print(findGCD(a,b));
        sc.close();

    }
}
