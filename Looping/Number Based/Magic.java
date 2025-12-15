import java.util.*;
public class Magic
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
        int sum=a;
        while(sum>=10)
        {
            int temp=sum;
            sum=0;
           while(temp!=0)
           {
            int b=temp%10;
            sum+=b;
            temp/=10;
           }
        }
           if(sum==1)
            System.out.println("It is a Magic number");
        else
             System.out.println("It is a not a Magic number");
    }
}