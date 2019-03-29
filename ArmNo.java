/* print armstrong no. */
import java.util.*;
public class ArmNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n =sc.nextInt();
        armNo(n);

    }
    static void armNo(int n){
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
        System.out.println("....");
        int mul =1;int arm =0;
        int t=n;
        while(t!=0)
        {
            
            
                int rem=t%10;
                for( int i=1;i<=count;i++)
                {
               mul =mul*rem;
                }
             arm =arm+mul;
             t=t/10;
            
            }    
            if(arm == t)
                System.out.println(" no  is armstrong");
            
            else
            System.out.println(" no. is not armstrong");
            
        
    }
}