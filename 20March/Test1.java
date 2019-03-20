/* How to find the missing number in given integer array of 1 to 100? */
import java.util.*;
public class Test1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter an array");
        int input=sc.nextInt();
        int [] a=new int[input];
        System.out.println("print array element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int miss=getMissingNo(a,input);
        System.out.println(miss);
    }
    public static  int getMissingNo( int ar[],int n){
        int i,total;
        total =(n+1)*(n+2)/2;
        for( i=0;i<n;i++){
            total =total-ar[i];
            
        }
        return total;
    }
}