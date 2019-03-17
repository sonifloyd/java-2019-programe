  
  import java.util.*;
  public class VectorExample{
      public static void main(String[] args) {
          // declare vector intial size 2
          Vector<String> vec =new Vector<String>();
          vec.addElement("soni");
          vec.addElement("moni");
          vec.addElement("sanjeet");
          vec.addElement(" ranjeet");
          System.out.println("size is "+ vec.size());
          System.out.println(" capacity "+vec.capacity());
          vec.addElement("first1");
          vec.addElement("first2");
          vec.addElement("first3");
          System.out.println("size is "+ vec.size());
          System.out.println(" capacity "+vec.capacity());
          // display element
          System.out.println(vec);


      }
  }