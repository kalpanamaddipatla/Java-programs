# Java-programs
import java.util.*;
public class Harshad {
  public static void main(String[] args) {
        System.out.println("enter number:"); 
        int n=18;
        int sum=0;
        int c=n;
        while(c>0)
        {
            int rem=c%10;
            sum=sum+rem;
            c=c/10;
        }
        if(n%sum==0)
        System.out.println("Harshad number");
        else
        System.out.println("Not a Harshad number");
        
    }
}
