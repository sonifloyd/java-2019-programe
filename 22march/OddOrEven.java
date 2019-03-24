/*   verify a number is even or odd*/
import java.util.*;
public class OddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int input = sc.nextInt();
        oddOrEven(input);
    }
    public static void oddOrEven( int n){
        if(n%2==0){
            System.out.println("Even no.");
        }
        else{
            System.out.println("Odd no.");
        }
    }
}