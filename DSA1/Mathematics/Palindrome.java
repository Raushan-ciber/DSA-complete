package DSA1.Mathematics;
import java.util.*;

public class Palindrome {
    public static boolean checkPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n>0){
            reverse = reverse * 10 +n%10;
            System.out.println(reverse);
            n = n/10;
        }
        return original ==reverse;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(checkPalindrome(n));

    }
}
