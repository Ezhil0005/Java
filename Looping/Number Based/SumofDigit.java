import java.util.*;
public class SumofDigit
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a Number:");
        int a=obj.nextInt();
        int sum=0;
      int  temp=a;
       while(temp>0)
       {
        int b=temp%10;
        sum=sum+b;
        temp/=10;
       }
        System.out.println("The sum of the digit "+a+" is: "+sum);
    }
}