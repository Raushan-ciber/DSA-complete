package DSA1.Mathematics;

import java.util.*;

public class Countdigit {
    
    public static void main(String args[]){
            Scanner dedo = new Scanner(System.in);
            int n = dedo.nextInt();
            System.out.println(countDigit(n));
            int count =0;
            //solving with loops
            //Time complexity = log(n)
            //Space complexity = 0(1)
            while(n>0){
                count++;
                n= n/10;
            }
            System.out.print(count);
        
    }
    // solving with recursion method
    //Time complexity = O(log(n))
    //Space complexity = O(log(n))
    public static int countDigit(int n){
        if(n<=0){
            return 0;
        }
        return 1 + countDigit(n/10);
    }
}
