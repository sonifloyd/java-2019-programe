/*  Java  interview question  */
import java.util.Scanner;
public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a string");
        String  st =sc.next();
        isReverse(st);

        
    }
    static void isReverse(String str){
        String nstr="";
        for(int i=0;i<str.length();i++){
            nstr=charAt(0)+nstr;
        }
        System.out.println(nstr);
    }
}
