

/*  Palindrome String */
import java.util.*;
public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of test cases");
        int n =sc.nextInt();
        System.out.println(" Length of string");
        int len=sc.nextInt();
        System.out.println(" Enter your string");
        String st =sc.next();
        isPalindrome(st);

    }
    
    static void isPalindrome(String s){
        String nstr="";
        for(int i=0;i<s.length();i++){
         nstr =  s.charAt(i)+ nstr;
        }
        if(s.equals(nstr))
        System.out.println("yes");
        else
        System.out.println(" no");
    }
}