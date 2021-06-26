# Java-programs
import java.util.*;
public class Fibonacci_series {
   public static void main(String[] args) {
  System.out.println("Enter number:");
  int n=10;
  int t1=0,t2=1;
   System.out.println(t1+""+t2);
   for (int i=3;i<=n;i++)
   {
   int sum=t1+t2;
   System.out.println(""+sum);
   t1=t2;
   t2=sum;
   }
    }
}
