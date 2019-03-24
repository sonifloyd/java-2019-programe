/*  How to find the maximum occurring character in given String?*/ 
import java.util.*;
public class Test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input=sc.next();
        maxOccureChar(input);
        
    }
    public static void maxOccureChar( String str){
        // convert into char array
       // char [] ch=s.toCharArray();
        HashMap<String ,Integer>  hm = new HashMap<>();
        String []  s=str.split(" ");
        for(String tempString : s){
            if(hm.get(tempString)!= null)
            {
             hm.put(tempString,hm.get(tempString));
            }
            else
            {
                hm.put(tempString ,1);
            }
        }
        System.out.println(hm);

    }
}