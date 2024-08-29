import java.util.*;
public class Table
{
    public static void main(String[] arg)
    {
        int Num = 0, i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter a Number : ");
        Num = sc.nextInt();

        while(i<=10)
        {
            System.out.print("\n " +Num+ " * " +i+ " = " + Num * i +"");
            i++;
        }
    }
}