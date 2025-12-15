import java.util.*;
public class Buzz
{
    public static void main(String []args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.print("Enter a Number:");
        int a=obj.nextInt();
           if((a%7==0)||a%10==7)
            System.out.println("It is a buzz number");
        else
             System.out.println("It is a not a buzz number");
    }
}