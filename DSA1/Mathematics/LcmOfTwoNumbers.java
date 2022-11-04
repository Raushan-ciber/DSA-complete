package DSA1.Mathematics;
import java.util.*;

public class LcmOfTwoNumbers {
    //naive solution



    //public static int findLcm(int a, int b){
    //    int res = Math.max(a,b);
    //    while(true){
    //        if(res%a==0 && res%b==0){
    //            return res;
    //        }
    //        res++;
    //    }
    //   
    //}
    public static int findGcd(int a,int b){
        if(b==0){
            return a;
        }
        return findGcd(b, a%b);
    }
    public static int LcmOfTwoNmbers(int a,int b){
          return (a*b)/findGcd(a, b);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(LcmOfTwoNmbers(a, b));
        sc.close();
    }
}
