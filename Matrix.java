# Java-programs
import java.util.*;
public class Zeros {
    public static void main(String[] args) {
     System.out.println("Enter row and col sizes:"); 
     int n=3;
     int m=3;
     System.out.println("Enter"+n +"X"+m+"Elements:");
     int mat[][]=new int[n][m];
     int row[]=new int[n];
     int col[]=new int[m];
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
         mat[i][j]=1;
         if(mat[i][j]==0)
         {
             row[i]=1;
             col[j]=1;
         }
         }
     }
     for(int i=0;i<n;i++)
     {
         if(row[i]==1)
         {
      for(int j=0;j<m;j++)
      {
          mat[i][j]=0;
      }
         }
         
     }
     for(int j=0;j<m;j++)
     {
         if(col[j]==1)
         {
             for(int i=0;i<n;i++)
             {
                 mat[i][j]=0;
             }
         }
     }
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
   System.out.print(mat[i][j]+" ");
         }
         System.out.println();
     }
     
    }
}
