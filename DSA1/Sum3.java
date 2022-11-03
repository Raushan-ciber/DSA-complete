package DSA1;

import java.util.*;

public class Sum3 {
    public static int fun(int n){
        int sum=0;   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){   
                sum++;
            }
        }
        return sum;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.print(fun(n));

    }
}
