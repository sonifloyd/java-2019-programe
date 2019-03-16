/*  Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string: "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

 */
import java.util.*;
public class T2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the sentance");

        String str=sc.nextLine();
        System.out.println(" original String :"+str);
        // enter word u want to replace
        System.out.println(" replace word");
        String re=sc.next();
        System.out.println("replace word :"+ re);
        // enter change word
        System.out.println(" change word");
        String cg = sc.next();
        System.out.println("change word :"+cg);
        String nstr=str.replaceAll(re,cg);
        
        System.out.println(" New string "+ nstr);
    }
}