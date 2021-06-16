# Java-programs
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        System.out.println("enter number:");
        int n=1234;
        int rem;
        int even=0,odd=0;
        int even_sum=0,odd_sum=0;
        while(n!=0)
        {
            rem=n%10;
            if(rem%2==0)
            {
                even++;
          even_sum=even_sum+rem;
            }
            else
            {
                odd++;
             odd_sum=odd_sum+rem;
            }
            n=n/10;
            }
            System.out.println("Even digits="+even);
            System.out.println("Even digits="+even_sum);
            System.out.println("Odd digits="+odd);
            System.out.println("Odd digits="+odd_sum);
            
            
            
        
        
      
    }
}
