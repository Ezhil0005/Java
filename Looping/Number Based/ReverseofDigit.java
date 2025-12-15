import java.util.*;
public class ReverseofDigit
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("enter a Number:");
        int a=obj.nextInt();
        int reverse=0;
         int temp=a;
       while(temp>0)
       {
        int b=temp%10;
        reverse=(reverse*10)+b;
        temp/=10;
        
       }
        System.out.println("The reverse of the digit "+a+" is: "+reverse);
    }
}