/* How to find the duplicate number on a given integer array? */
import java.util.*;
public class Test2{
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an array");
        int input = sc.nextInt();
        int arr[]=new int[input];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //call method
        duplicate(arr,input);

        
    }
    public static void duplicate(int a[], int size){
        int i,j;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]+"");
                }
            }
        }
    }
}