/*  Write a Java program to replace all the 'd' characters with 'f' characters.*/
import java.util.*;
public class T3{
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
        String nstr=str.replace(re,cg);
        
        System.out.println(" New string : "+ nstr);
    }
}