# Java-programs
import java.util.*;
public class Min_Max {
    public static void main(String[] args) {
     int n=43856;
     int rem=0, max=0;
     int min=9;
     while(n!=0)
     {
         rem=n%10;
         if(rem>max)
         max=rem;
         if(rem<min)
         min=rem;
         n=n/10;
     }
     System.out.println("maximum digit="+max);
     System.out.println("minimum digit="+min);
     
    }
}
