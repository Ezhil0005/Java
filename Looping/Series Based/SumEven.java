import java.util.*;
public class SumEven
{
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=obj.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=a;i++)
        {
          if(i%2==0)
            even+=i;
        else
            odd+=i;
        }
        System.out.println("The sum of even: "+even);
        System.out.println("The sum of odd: "+odd);
    }
}