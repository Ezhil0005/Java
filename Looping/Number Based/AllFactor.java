import java.util.*;
public class AllFactor
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("enter a Number:");
        int a=obj.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++)
        {
           if(a%i==0)
           {
             sum+=i;
           }
        }
        System.out.println("the sum of the all factors is :"+sum);
    }
}