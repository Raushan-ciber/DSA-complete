package DSA1;

import java.util.Scanner;

public class Sum2 {
    public static int fun2(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.print(fun2( n));
    }
}
