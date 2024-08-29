import java.util.*;
public class Max2
{
    public static void main(String[] arg)
    {
        int N1=0, N2=0;
        Scanner s=new Scanner(System.in);

        System.out.print("\n Enter first number:");
        N1=s.nextInt();

        System.out.print("\n Enter second number:");
        N2=s.nextInt();
         
        if(N1 > N2)
        {
          System.out.print("\n " +N1+" is maximum number than"+N2+ " ");
        }
        else
        {
            System.out.print("\n " +N2+" is maximum number than"+N1+ " ");
        }
    }
}