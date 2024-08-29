import java.util.*;
public class Even_odd
{
    public static void main(String[] arg)
    {
        int Num;
        Scanner s=new Scanner(System.in);
        
        System.out.print("\n Enter a number:");
        Num=s.nextInt();

        if(Num%2==0)
        {
            System.out.println("Number is Even");
        }
        
        else
        {
            System.out.println("Number is odd");
        }
    }
}