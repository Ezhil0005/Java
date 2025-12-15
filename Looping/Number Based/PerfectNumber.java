import java.util.*;
public class PerfectNumber
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
        int temp=a;
        int sum=0;
            for(int i=1;i<temp;i++)
            {
                if(temp%i==0)
                {
                    sum+=i;
                }
            }
           
        if(sum==a)
            System.out.println("It is a Perfect number");
        else
             System.out.println("It is a not a Perfect number");
    }
}