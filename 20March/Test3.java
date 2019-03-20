/*  How to find all pairs of integer array whose sum is equal to a given number?*/
import java.util.*;
public class Test3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int input =sc.nextInt();
        //declare array
        int a[]=new int[input];
        System.out.println(" print an Array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        // call method
        getPairsCount(a,input);

        
    }
    public static void getPairsCount( int [] arr,int sum){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                    System.out.println("count of pair "+arr[i]+"and"+arr[j]+" is"+count);
                }
            }
        }
    }
}