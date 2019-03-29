/* check prime no. or not*/
import java.util.*;
public class Isprime{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter any no");
        int n= sc.nextInt();

    }
    static void prime(int n){
        int count=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            count++;
            

        }
        System.out.println(count);
        if(count>0)
            System.out.println("No. is not prime");
            else 
            System.out.println("prime no");
        
    }
}