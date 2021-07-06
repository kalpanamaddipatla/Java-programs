# Java-programs
public class Rev_str{
  public static void main(String[] args) {
    String str = "suresh";
    char ch[]=str.toCharArray();
    String rev="";
  for (int i=ch.length-1;i>=0;i--)
  {
      rev=rev+ch[i];
  }
  System.out.println("reversed string="+rev);
    
    
    
        
    }
}
