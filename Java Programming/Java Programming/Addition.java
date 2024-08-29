import java.util.*;
public class Addition
{
    public static void main(String[] arg)
    {
        int N1=0, N2=0, Add=0;
        Scanner s = new Scanner(System.in);

        System.out.print("\n Enter first no:");
        N1=s.nextInt();

        System.out.print("\n Enter second no:");
        N2=s.nextInt();

        Add=N1+N2;
        System.out.print("Additon of two number is:"  +Add);
    }
}
