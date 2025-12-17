import java.util.*;
public class Nsum
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
          int b=obj.nextInt();
          sum+=b;

        }
        System.out.println("The sum is: "+sum);
        
    }
}