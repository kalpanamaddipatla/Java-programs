# Java-programs
package strings;
import java.util.*;
public class Anagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 System.out.println("Enter 2 strings:"); 
     String str1=sc.nextLine();
     String str=sc.nextLine();
     boolean f=true;
     if(str.length() !=str.length())
     f=false;
     else
     {
    char s1[]=str1.toCharArray();
    char s2[]=str2.toCharArray();
       Arrays.sort(s1);
       Arrays.sort(s2);
       f=Arrays.equals(s1,s2);
     }
     if(f)
     System.out.println("Anagram");
     else
     System.out.println("Not an Anagram");
     
    }
}
