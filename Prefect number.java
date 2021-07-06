# Java-programs
public class prefect{
    public static void main(String[] args) {
    System.out.println("Enter number:"); 
    int n=28;
    int sum=0;
    for(int i=1;i<=(n/2);i++)
    {
    if(n%i==0)
    sum=sum+i;
    }
    if(sum==n)
    System.out.println("prefect number");
    else
    System.out.println("Not prefect number");
    }
}
