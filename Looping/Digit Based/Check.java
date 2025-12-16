import java.util.*;
public class Check
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int temp=a;
        int count=0;
        while(temp>0)
        {
            int c=temp%10;
            if(c==b)
            {
                count++;
            }
            temp/=10;
        }
        if(count>=1)
        System.out.println("yes");
    else
        System.out.println("no");
    }
}