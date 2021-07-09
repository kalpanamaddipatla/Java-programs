# Java-programs
 import java.io.*;
 import java.util.*;
 public class solution{
  public static void main(String[] args) {
      Scanner sc=new scanner(System.in);
        String A=sc.next();
        String B=sc.next();
   System.out.println(A.length()+B.length()); 
     System.out.println(A.compareTo(B)>0?"yes":"no");
     System.out.println(A.substring(0,1). toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
