/* If both string length not equal then return false
   2. must be lower case or uppercase
   3.Remove space
    */
    import java.util.*;
    public class Anagram{
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter 1st string");
            String str1=sc.nextLine();
            System.out.println("Enter 2nd String");
            String str2=sc.nextLine();
        }
        public  static boolean isAnagram(String s1,String s2)
        {
          if(s1.length()!=s2.length())
          return false;
          //convert into char array
          char[] ch1 = s1.toCharArray();
          char[] ch2 =s2.toCharArray();
          s1=s1.replaceAll(ch1,"");
        }
    }