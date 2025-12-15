import java.util.*;
public class Factors
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("enter a Number:");
        int a=obj.nextInt();
         System.out.println("The factors of a given number is:");
        for(int i=1;i<=a;i++)
        {
           if(a%i==0)
           {
             System.out.print(i+" ");
           }
        }
    }
}