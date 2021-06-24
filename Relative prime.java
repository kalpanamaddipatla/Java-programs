# Java-program
import java.util.*;
public class relative_primes {
   public static void main(String[] args) {
  System.out.println("Enter 2 numbers:");
    int n1=35;
    int n2=48;
    int gcd=1;
   for(int i=1;i<=n1&&i<=n2;i++)
   {
    if(n1%i==0&&n2%i==0)
    gcd=i;
   }
   if(gcd==1)
   System.out.println("Relative prime");
   else
   System.out.println("Not Relative prime");
   }
}
        
 
 
 

  
    
