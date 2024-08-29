import java.util.*;
public class Calculator
{
    public static void main(String[] arg)
    {
        int Num1 = 0, Num2 = 0, Add,Sub,Mul,Mod;
        float Div;

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Frist Number : ");
        Num1 = sc.nextInt();

        System.out.print("\n Enter Second Number : ");
        Num2 = sc.nextInt();

        Add = Num1 + Num2;
        System.out.print("\n Addition of two numbers is : " +Add);

        Sub = Num1 - Num2;
        System.out.print("\n Subtraction of two numbers is : " +Sub);

        Mul = Num1 * Num2;
        System.out.print("\n Multiplication of two numbers is : " +Mul);

        Div = Num1 / Num2;
        System.out.print("\n Division of two numbers is : " +Div);

        Mod = Num1 % Num2;
        System.out.print("\n Module of two numbers is : " +Mod);

    }
}