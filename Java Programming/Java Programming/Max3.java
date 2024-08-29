import java.util.*;
public class Max3
{
    public static void main(String[] arg)
    {
        int N1=0, N2=0, N3=0;
        Scanner s=new Scanner(System.in);

        System.out.print("\n Enter first number:");
        N1=s.nextInt();

        System.out.print("\n Enter second number:");
        N2=s.nextInt();

        System.out.print("\n Enter third number:");
        N3=s.nextInt();
         
        if(N1 == N2  && N2 == N3)
        {
          System.out.print("\n This number are equal");
        }
        
        else if(N1 > N2  && N1 > N3)
        {
            System.out.print("\n " +N1+" is maximum number");
        }

          else if(N2 > N1  && N2 > N3)
        {
            System.out.print("\n " +N2+" is maximum number");
        }

          else if(N3 > N1 && N3 > N2)
        {
            System.out.print("\n " +N3+" is maximum number");
        }
    }
}