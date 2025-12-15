import java.util.*;
public class Palindrome
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
       if(reverse==a)
        System.out.println("The digit "+a+" is Palindrome");
    else
        System.out.println("The digit "+a+" is not Palindrome");
    }
}