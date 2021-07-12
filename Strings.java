# Java-programs

import java.io.*;
import java.util.*;
public class Solution{
  public static void main(String[] args) {
Scanner sc=new Scanner(.in);
String s=scan.nextLine();
if(s.trim().length()<1||s.trim().length()>4000000)  
    {
    System.out.println(0); 
    return ;
    }
    String words[]=s.trim(). split ("[!,?._'@]+");
    System.out.println(words.length);
    for(String w:words)
    {
      System.out.println(w);
    }
    scan.close();
    
}
}
