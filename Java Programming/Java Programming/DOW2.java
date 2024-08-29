import java.util.*;
public class DOW2
{
    public static void main(String[] args)
    {
        int Day=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        Day = sc.nextInt();

        switch(Day)
        {
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Thuesday");
            break;

            case 4:
            System.out.println("Wedesday");
            break;

            case 5:
            System.out.println("Thursday");
            break;

            case 6:
            System.out.println("friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;

            default:
            System.out.println("Invalid");
        }
    }
}