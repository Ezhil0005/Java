import java.util.*;
public class Strong
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("enter a Number:");
        int a=obj.nextInt();
        int temp=a;
        int sum=0;
        int fact=1;
        while(temp>0)
        {
            int b=temp%10;
            
            for(int i=1;i<=b;i++)
            {
                fact=fact*i;
            }
            sum+=fact;
             temp/=10;
             fact=1;
        }
        if(sum==a)
            System.out.println("It is a Strong number");
        else
             System.out.println("It is a not Strong number");
    }
}