import java.util.*;
public class Neon
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
        int temp=a;
        int sum=0;
        int square=a*a;
            while(square>0)
            {
                int b=square%10;
                sum+=b;
                square/=10;
            }
           
        if(sum==a)
            System.out.println("It is a Neon number");
        else
             System.out.println("It is a not a Neon number");
    }
}