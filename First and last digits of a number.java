# Java-programs
import java.util.*;
public class Palin_number{
    public static void main(String[] args) {
        System.out.println("Enter number:"); 
        int n=12345;
        int id=n%10;
        int d=(int) Math.log10(n);
        int fd=(int)(n/Math.pow(10,d));
        int rev=id;
        rev=rev*(int)(Math.pow(10,d));
        rev=rev+n%(int)(Math.pow(10,d));
        rev=rev-id;
        rev=rev+fd;
        System.out.println("Swapped number="+rev);
    }
}
