/*  print prime no. b/w given range */
import java.util.*;
public class PrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter  lower range");
        int l =sc.nextInt();
        System.out.println("Enter upper range");
        int u = sc.nextInt();
        System.out.println(" Enter no");
        int n =sc.nextInt();
        int i;
        System.out.println(" .......");
    

        for(int x=l+1;x<=u-1;x++){
            for( i=2;i<x;i++ )
            if(x%i==0)
            break;
             if(i==x)
             System.out.println(x);
            
        }
    }
}