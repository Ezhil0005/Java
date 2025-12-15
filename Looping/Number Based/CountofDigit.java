import java.util.*;
public class CountofDigit
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a Number:");
        int a=obj.nextInt();
        int count=0;
         int temp=a;
       while(temp>0)
       {
        temp/=10;
        count++;
       }
        System.out.println("The Count of the digit "+a+" is: "+count);
    }
}