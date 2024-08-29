import java.util.*;
public class Reverse_Table
{
    public static void main(String[] arg)
    {
        int Num = 0, i = 10;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter a Number : ");
        Num = sc.nextInt();

        while(i>=1)
        {
            System.out.print("\n " +Num+ " * " +i+ " = " + Num * i +"");
            i--;
        }
    }
}