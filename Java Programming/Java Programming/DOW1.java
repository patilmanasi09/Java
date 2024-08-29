import java.util.*;
public class DOW1
{
    public static void main(String[] arg)
    {
        int Day=0;
        Scanner s=new Scanner(System.in);
        System.out.print("\n Enter a valid day number:");
        Day=s.nextInt();
        
        if(Day == 1)
        {
            System.out.print("\n Sunday");
        }
        else if(Day == 2)
        {
            System.out.print("\n Monday");
        }
        else if(Day == 3)
        {
            System.out.print("\n Tuesday");
        }
        else if(Day == 4)
        {
            System.out.print("\n Wedensday");
        }
        else if(Day == 5)
        {
            System.out.print("\n Thursday");
        }
        else if(Day == 6)
        {
            System.out.print("\n Friday");
        }
        else if(Day == 7)
        {
            System.out.print("\n Saturday");
        }
        else
        {
            System.out.print("\n Enter a valid number");
        }
       
    }
}