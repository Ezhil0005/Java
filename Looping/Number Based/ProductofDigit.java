import java.util.*;
public class ProductofDigit
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a Number:");
        int a=obj.nextInt();
        int product=1;
         int temp=a;
       while(temp>0)
       {
        int b=temp%10;
        product*=b;
        temp/=10;
        
       }
        System.out.println("The product of the digit "+a+" is: "+product);
    }
}