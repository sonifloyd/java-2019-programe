/*  Write a method which will remove any given character from a String? */

import java.util.Scanner;
public class Test2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String st = sc.next();
        char ch1[]=st.toCharArray();//  convert string int char array
        System.out.println(" enter charcter");
        char ch =sc.next().charAt(0);
        isRemove(ch1,ch);
    }
    static  void isRemove( String str ,char c){
        char[] ch2=str.toCharArray();
        for( int i=0;i<ch2.length-1;i++){
            String nst=str.replace(ch2,c);
            System.out.println(" after removing charcter "+ nst);
        }
        //System.out.println(" after removing charcter "+ nst);
    }
}