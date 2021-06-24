# Java-programs
import java.util.*;
public class twin_primes {
   static int prime (int n)
   {
       int f=1;
       {
     for (int i=2;i<=n/2;i++)
     {
     if(n%i==0)
     f=0;
     break;
     }
     return 1;
    }  
   }
    public static void main(String[] args) {
        int n1,n2;
  System.out.println("Enter 2 numbers:");
  n1=3;
  n2=5;
  if(prime(n1)==1&&prime(n2)==1&&(n2-n1==2))
  System.out.println("Twin primes");
  else
  System.out.println("Not twin primes");
  
    }
}
