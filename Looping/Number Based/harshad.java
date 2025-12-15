import java.util.*;
public class harshad
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
        int temp=a;
        int sum=0;
            while(temp>0)
            {
                int b=temp%10;
                sum+=b;
                temp/=10;
            }
           
        if(a%sum==0)
            System.out.println("It is a harshad number");
        else
             System.out.println("It is a not a harshad number");
    }
}