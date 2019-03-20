/* How to remove duplicates from given array in Java? (solution)
 */
import java.util.*;
public class Test4{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();
        //declare an array
        int a[]=new int[input];
        //print
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(" Remove duplicate array");
        // call method
        removeDuplicate(a, input);
        
    }
    public static void removeDuplicate(int arr[],int size){
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for( int no : hs){
            System.out.println(no);
        }
    }
}