/*  Anagram */
import java.util.*;
public class Test2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter 1st string");
        String s1 =sc.next();
        System.out.println(" Enter 2st string");
        String s2 =sc.next();
        isAnagram(s1, s2);
        

    }
    static void  isAnagram( String s1,String s2){
        if(s1.length()!=s2.length())
        return ;
         s1=s1.toLowerCase();
         s2=s2.toLowerCase();
        System.out.println( " .....");
         s1=s1.replaceAll("","");
         s2=s2.replaceAll("","");
        System.out.println(" ...");
       s1=Arrays.sort(s1);
       s2=Arrays.sort(s2);
        System.out.println(s1);
        System.out.println(s2);

    }
}