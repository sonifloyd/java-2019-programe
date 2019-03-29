/* check no. is palindrom or not*/
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class PalindromeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no.");
        int n= sc.nextInt();
        ispali(n);
    }
    
    static void ispali(int n){
        int rev=0;
        while(n!=0){
        int r=n/10;
         rev=rev*10+r;
         n=n/10;
    }
    System.out.println(" reverse no is"+ rev);
    if(rev==n)
    System.out.println("palindrom");
    else 
    System.out.println(" not palindrome");
}

}