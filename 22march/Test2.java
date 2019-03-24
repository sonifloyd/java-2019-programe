/*  Java program to count the occurrence of each character 
in a string using Hashmap*/
/*Input: str = "Ajit" 
Output: 
A 1
t 1
i 1
j 1 */
import  java.util.*;
import java.util.HashMap;
public class Test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter string");
        String input = sc.nextLine();
        characterCount(input);
    }
    static void characterCount(String s)
    {
        // creating hashmap containing char as a key and occurrence as a value
        HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
        // converting given string to char array
        char[]  strArray =s.toCharArray();
        // checking each char of s
        for(char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //if char is present in charCount then incrementing its count by 1
                charCountMap.put(c,charCountMap.get(c)+1);

            }
            else
            {
                charCountMap.put(c,1);
            }
        }
        // printing the charcountMap
        for(Map.Entry  entry : charCountMap.entrySet())
        {
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}