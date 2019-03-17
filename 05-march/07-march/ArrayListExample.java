/*   how to add element to an arraylist */
import java.util.*;


public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList <String>  alist=new ArrayList<String>();
        alist.add(" soni");
        alist.add(2,"moni");
        alist.add("ranjeet");
        alist.add(3,"shefali");
        // Display element 
        System.out.println(alist);
        alist.remove("soni");
        alist.remove(3);
        // display after removing 
        System.out.println(alist);
        
        
    }
}