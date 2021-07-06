# Java-program
public class pattern {
   public static void main(String[] args) {
    System.out.println("Enter number:"); 
        int n=7;
        for(int i=n-1;i>=1-n;i--)
        {
       for(int j=n-1;j>=1-n;j--)
       {
      if(Math.abs(i)>Math.abs(j))
     System.out.print(Math.abs(i)+1+"  ");
     else
    System.out.print(Math.abs(j)+1+"  ");
       }
       System.out.println();
        }
    }
}
