package DSA1.Mathematics;
import java.util.*;
public class TrailingZero {
    //Naive approach
    //public static int fact(int n){
    //    if(n==0){
    //        return 1;
    //    }
    //    return n * fact(n-1);
    //}


    //efficient approach
    public static int countTrailingZero(int n){
        int res =0;
        for(int i=5;i<=n;i=i*5){
            res = res +n/i;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countTrailingZero(n));



        
        //int facotialno = fact(n);
        
        //int count =0;
        //while(facotialno%10==0){
        //    count++;
        //    facotialno =facotialno/10;
        //
        //}
        //System.out.print(count);
        sc.close();
    }
}
