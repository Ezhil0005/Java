import java.util.*;
public class Firstdigit
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("Enter a number :");
        int a=obj.nextInt();
        int temp=a;
        int c=0;
        while(temp!=0)
        {
            c=temp;
            temp/=10;

        }
        System.out.println("the first digit is "+c);
    }
}