

import java.util.*;
public class LinkedList{
    public static void main(String[] args) {
        // declare  linkedlist
        LinkedList<String> list =new LinkedList<String>();
        list.add("soni");
        list.add(1,"moni");
        //display element
        System.out.println(list);
        list.remove("soni");
        //after removing
        System.out.println(list);

    }
}