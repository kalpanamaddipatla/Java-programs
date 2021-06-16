# Java-programs
import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        System.out.println("enter number:"); 
        int n=1234;
        int sum=0,rem;
        while(n!=0)
    {
        rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
    System.out.println("sum of digits="+sum);
    }
}
