import java.util.*;
public class Occurance
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
        long a=obj.nextLong();
        int b=obj.nextInt();
        long temp=a;
        int count=0;
        while(temp>0)
        {
            long c=temp%10;
            if(c==b)
            {
                count++;
            }
            temp/=10;
        }
        System.out.println("The count of occurance is :"+count);
    }
}