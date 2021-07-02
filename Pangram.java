# Java-programs
package strings;
import java.util.*;
public class pangram{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    System.out.println("Enter sentence:"); 
     String str=sc.nextLine();
     int f=1;
     if(str.length() <26)
     f=0;
{
     for(char ch='a';ch<='z';ch++) 
     {
         if(str.indexOf(ch)<0)
         {
             f=0;
             break;
             }
     }
     }
     if(f==1)
     System.out.println("pangram");
     else
     System.out.println("Not pangram");
     
    }
}
