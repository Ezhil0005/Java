import java.util.*;
public class Factorial
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter a Number:");
        int a=obj.nextInt();
        int fact=1;
       
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of "+a+" is: "+fact);
    }
}