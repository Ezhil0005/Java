import java.util.*;
public class Sum
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}